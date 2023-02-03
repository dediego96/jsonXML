package elercicioXmlJson2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor

@XmlType (propOrder = { "name", "width", "height"})
@XmlAccessorType(XmlAccessType.FIELD) 

public class Window {
	
	@EqualsAndHashCode.Include
	@NonNull
	@XmlAttribute
	private String title;
    private String name;
    private int width;
    private int height;

}
