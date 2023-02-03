package ejercicioXmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gson.annotations.SerializedName;

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
@XmlType (propOrder = {"glossDiv"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Glossary {
	
	@EqualsAndHashCode.Include	
	@XmlAttribute
	private String title;
	@SerializedName("GlossDiv")
	@XmlElement(name="GlossDiv")
	private GlossDiv glossDiv;

}




