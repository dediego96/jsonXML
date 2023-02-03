package ejercicioXmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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

@XmlType (propOrder = {"sortAs", "glossTerm", "acronym", "abbrev", "glossDef", "slossSee"})
@XmlAccessorType(XmlAccessType.FIELD)

public class GlossEntry {
	
	@EqualsAndHashCode.Include	
	@SerializedName("ID")
	@XmlAttribute
	private String id;
	
	@SerializedName("SortAs")
	@XmlElement(name="SortAs")
	private String sortAs;
	
	@SerializedName("GlossTerm")
	@XmlElement(name="GlossTerm")
	private String glossTerm;

	@SerializedName("Acronym")
	@XmlElement(name="Acronym")
	private String acronym;
	
	@SerializedName("Abbrev")
	@XmlElement(name="Abbrev")
	private String abbrev;
	
	@SerializedName("GlossDef")
	@XmlElement(name="GlossDef")
	private GlossDef glossDef;
	
	@SerializedName("GlossSee")
	@XmlElement(name="GlossSee")
	private String slossSee;

	
}
