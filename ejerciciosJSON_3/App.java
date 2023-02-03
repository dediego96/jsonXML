package ejerciciosJSON_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import ejerciciosJSON_1.Empresa;

public class App {
	public static void main(String[] args) throws IOException {
		Pais pais;

		
		
			Gson gson = new Gson();
			
			Reader reader = new FileReader (new File ("ej3.json"));		
			pais = gson.fromJson(reader, Pais.class);
			reader.close();
			System.out.println("");
	}



	
}
