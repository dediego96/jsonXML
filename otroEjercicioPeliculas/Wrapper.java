package otroEjercicioPeliculas;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name="movies")

public class Wrapper {

	@XmlElement(name="peli") 
	List<Pelicula> pelis;

	public Wrapper(List<Pelicula> pelis) {
		this.pelis = pelis;
	}
	
}
