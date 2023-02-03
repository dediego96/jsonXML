package ejercicioXmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

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

@XmlAccessorType(XmlAccessType.FIELD)

public class GlossDiv {
	@EqualsAndHashCode.Include	
	@XmlAttribute
	private String title;
	@SerializedName("GlossList")
	@XmlElement(name="GlossDiv")
	private GlossList glossList;

}
