package ejerciciosJSON_1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder= {"nombre", "altura", "peso", "soltero", "pasatiempos"})

public class Persona {
	
	@EqualsAndHashCode.Include
	@NonNull
	private String nombre;
	private float altura;
	private int peso;
	private boolean soltero;
	private List<String> pasatiempos;

}
