package elercicioXmlJson2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor

@XmlType (propOrder = { "data", "size", "style", "name", "hOffset", "vOffset", "alignment", "onMouseUp"})
@XmlAccessorType(XmlAccessType.FIELD) 

public class Text {

	@EqualsAndHashCode.Include
	@NonNull
	@XmlAttribute
	private String data;
	@XmlAttribute
	private String size;
	@XmlAttribute
	private String style;
	private String name;
    private int hOffset;
    private int vOffset;
    @XmlJavaTypeAdapter(AlignmentAdapter.class)
    private TipoAlignment alignment;
    private String onMouseUp;
	
}