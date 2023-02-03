package ejercicioXmlJson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;


public class App {

	public static void main(String[] args) throws IOException {
		
		try {
			
			Wrapper wrapper = leerJson();
			escribirXml(wrapper.getGlos());
			
		} catch (Exception e) {
			
			System.out.println("Mensaje: " + e. getMessage() + " || StackTrace: ");
			e.printStackTrace();
		} 	
	}
	
	private static void escribirXml(Glossary wrapper) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Glossary.class);
		Marshaller ms = context.createMarshaller();
		
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(wrapper, System.out);
		ms.marshal(wrapper, new FileWriter("ejercicioXmlJsonSalida.xml"));
			
	}

	private static Wrapper leerJson() throws IOException {

		Wrapper wrapper;
		
		Gson gson = new Gson();
		Reader reader = new FileReader (new File ("ejercicioXmlJson.json"));	
		
		wrapper = gson.fromJson(reader, Wrapper.class);
		
		reader.close();

		return wrapper;
		
	}
	
}
