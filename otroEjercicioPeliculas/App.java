package otroEjercicioPeliculas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class App {

	public static void main(String[] args) {

		try {
			
			List<Pelicula> pelis = leerJSON();
			
			//Filtrar pelis -> que sean del siglo 20 y tengan una media de aprobada
			
			pelis = pelis.stream().
				filter(p -> Integer.parseInt(p.getYear()) >= 1990).
				filter(p -> p.getRatings().
								stream().mapToInt(Integer::intValue).average().orElse(0) > 5).
				collect(Collectors.toList());
			
			Wrapper pel = new Wrapper(pelis);
			escribirXML(pel);
			System.out.println("");
			
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

	}

	private static void escribirXML(Wrapper pel) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Wrapper.class);
		Marshaller ms = context.createMarshaller();

		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(pel, new FileWriter("cccc.xml"));	
		
	}

	private static void escribirXML(List<Pelicula> pelis) throws JAXBException, IOException {

		JAXBContext context = JAXBContext.newInstance(Pelicula.class);
		Marshaller ms = context.createMarshaller();

		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(pelis, System.out);
		ms.marshal(pelis, new FileWriter("pelisSalida.xml"));	
		
	}

	private static List<Pelicula> leerJSON() throws IOException  {
		

		List<Pelicula> pelis;
		GsonBuilder creadorGson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter());				
		Gson gson = creadorGson.create();		
		
		Reader reader = new FileReader (new File ("movies.json"));
		
		TypeToken<List<Pelicula>> listaDePelis = new TypeToken<List<Pelicula>>() {};
		
		pelis = gson.fromJson(reader, listaDePelis.getType());
		
		reader.close();
		
		return pelis;
	}

}
