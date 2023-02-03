package ejercicioXmlJson;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

@XmlType (propOrder = {"para", "glossSeeAlso"})
@XmlAccessorType(XmlAccessType.FIELD)


public class GlossDef {

	private String para;
	@SerializedName("GlossSeeAlso")
	@XmlElement(name = "GlossSeeAlso")
	private List<String> glossSeeAlso;
	
}
