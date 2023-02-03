package ejerciciosJSON_1;


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

		Empresa empresa = leerJson();
		
		if (empresa == null)
			System.out.println("Error al leer la emresa...");
		else 
			pintarEmpresa(empresa);
		
	}

	private static Empresa leerJson() {
		
		Empresa empresa;

		
		try {
			Gson gson = new Gson();
			
			Reader reader = new FileReader (new File ("ej1_Personas.json"));		
			empresa = gson.fromJson(reader, Empresa.class);
			reader.close();
		} catch (IOException e) {
			empresa = null;
			System.out.println("\n" + e.getMessage());
		}
		
		return empresa;
	
	}	
	
	private static void pintarEmpresa(Empresa empresa) {

		try {
			JAXBContext context = JAXBContext.newInstance(Empresa.class);
			Marshaller ms = context.createMarshaller();

			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(empresa, System.out);
			ms.marshal(empresa, new FileWriter("ej1SalidaEmpresa.xml"));

		} catch (JAXBException | IOException e) {
			System.out.println("\n" + e.getMessage());
		}
		
	}

}
