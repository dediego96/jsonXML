package elercicioXmlJson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.swing.GroupLayout.Alignment;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App {
	
	public static void main(String[] args) {
		try {
			
			Widget widget = leerXML();
			escribirJSON(widget);

		} catch (JAXBException | FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}



	private static void escribirJSON(Widget widget) throws FileNotFoundException {
		
		GsonBuilder creadorGson = new GsonBuilder().setPrettyPrinting();
		
		creadorGson.registerTypeAdapter(Boolean.class, new BooleanAdapter());
		creadorGson.registerTypeAdapter(Alignment.class, new AlignmentAdapter());
		
		
		Gson gson = creadorGson.create();
		
		String json = gson.toJson(widget);
		System.out.println(json);

		
		PrintWriter ficheroWidget = new PrintWriter (new File("ejercicioXmlJsonSalida2.json"));
		gson.toJson(widget,ficheroWidget);
		ficheroWidget.close();
/*
 
 		
 
  		EmpresaConFecha empresa = new EmpresaConFecha ();
		
		empresa.setNombre("villablanca");
		empresa.setFecha(LocalDate.now().minusDays(30)); // un mes antes de hoy
		
		Empleado e = new Empleado ("001","miguel", "infor", 999);
		empresa.getEmpleados().add(e);
		
		// poner bonito el json
		GsonBuilder creadorGson = new GsonBuilder().setPrettyPrinting();
		
		// poner adaptador de fechas
		creadorGson.registerTypeAdapter(LocalDate.class, new LocalDateAdapter());
		
		Gson gson = creadorGson.create();
		
		
		String json = gson.toJson(empresa);
		System.out.println(json);
		
		PrintWriter ficheroEmpresa = new PrintWriter (new File("empresaConFecha.json"));
		gson.toJson(empresa,ficheroEmpresa);
		ficheroEmpresa.close();
 
 */
		
	}
	{
		
	}


	private static Widget leerXML() throws JAXBException {

		Widget widget = new Widget();
		
		JAXBContext context = JAXBContext.newInstance(Widget.class);
		Unmarshaller ums = context.createUnmarshaller();
		
		widget = (Widget) ums.unmarshal(new File("ejercicioXmlJson2.xml"));
		
		return widget;
	}
	
}
