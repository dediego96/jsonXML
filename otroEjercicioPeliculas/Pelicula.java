package otroEjercicioPeliculas;

import java.time.LocalDate;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@XmlType (propOrder = { "title", "year", "genres", "ratings", "duration", "releaseDate", "originalTitle",
		"storyline", "actors", "posterurl"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Pelicula {
	
	@EqualsAndHashCode.Include
	@NonNull
	private String title;
	private String year;
	private String genres;
	
	@XmlList
	private List<Integer> ratings;
	private String duration;
	@XmlJavaTypeAdapter(LocalDateAdapterXML.class)
	private LocalDate releaseDate;
	private String originalTitle;
	private String storyline;	
	@XmlElementWrapper
	@XmlElement(name="actor")
	private List<String> actors; 
	private String posterurl;

}
