package ejerciciosJSON_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import daw.com.Teclado;

public class App {

	public static void main(String[] args) {
		
		List<Examen> examenes;
		
		try {
			examenes = leerJSON();
			ejsStreams(examenes);
			System.out.println("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("\n" + e.getMessage());
		}
		
		//ejsStreams(examenes);




	}

	private static void ejsStreams(List<Examen> examenes) {
		
		//ej1(examenes);
		//ej2(examenes);
		//ej3(examenes);
		//ej4(examenes);
		ej5(examenes);
		
	}

	private static void ej5(List<Examen> examenes) {
		
		//5-Para cada uno de las pruebas, muestra su título y sus profesores.	
		
		 examenes.stream().
			forEach(e-> System.out.println(e.getTitulo() + e.getProfesorado()));		 
		
	}

	private static void ej4(List<Examen> examenes) {
		
		//4-Pide por teclado el código de la prueba "ID" y muestra su título y profesores.
		
		String idTeclado = Teclado.leerString("\nDime el id");
		
		examenes.stream().
			filter(e -> e.getId().equals(idTeclado)).
			map(null);
		
	}

	private static void ej3(List<Examen> examenes) {
		
		//3-De las pruebas de tipo "No Presencial" muestra la URL de información.
		
		examenes.stream().
			filter(e -> e.getTipoFormacion().equals("NoPresencial")).
			map(e -> e.getUrl()).
			forEach(System.out::println);
		
		
		
	}

	private static void ej2(List<Examen> examenes) {
		
		//2-Muestra el título de las pruebas de nivel que van a durar más de dos horas.
		
		examenes.stream().
			filter(e -> e.getHoras() > 2).
			map(e -> e.getTitulo()).
			forEach(System.out::println);
		
	}

	private static void ej1(List<Examen> examenes) {

		//1-¿Cuántas pruebas de idiomas están descritas en el documento?
		
		System.out.println("Numero de prubas de idiomas: " + examenes.stream().
				map(e -> e.getNivel()).
				distinct().count());		
		
	}

	private static List<Examen> leerJSON() throws IOException {
		
		List<Examen> examenes;// = new ArrayList<>();
		
		
		
		//adaptador fechas
		GsonBuilder creadorGson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new DateTimeAdapter());
		Gson gson = creadorGson.create();
		
		Reader reader = new FileReader (new File ("pruebasdenivel.json"));
		
		TypeToken<List<Examen>> listaDeExamenes = new TypeToken<List<Examen>>() {};
		
		examenes = gson.fromJson(reader, listaDeExamenes.getType());
		
		reader.close();
		
		return examenes;
	}

}
