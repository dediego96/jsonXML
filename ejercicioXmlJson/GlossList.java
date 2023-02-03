package ejercicioXmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@XmlAccessorType(XmlAccessType.FIELD)

public class GlossList {
	
	@SerializedName("GlossEntry")
	@XmlElement(name="GlossEntry")
	private GlossEntry glossEntry;
	
}


