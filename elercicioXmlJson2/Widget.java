package elercicioXmlJson2;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.xml.bind.annotation.XmlAccessType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@XmlRootElement
@XmlType(propOrder = { "debug", "window", "image", "text"})
@XmlAccessorType(XmlAccessType.FIELD) 

public class Widget {

	@XmlJavaTypeAdapter(BooleanAdapter.class)
	private Boolean debug;
	private Window window;
	private Image image;
	private Text text;	
	
}