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
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@XmlType (propOrder = { "hOffset", "vOffset", "alignment"})
@XmlAccessorType(XmlAccessType.FIELD) 


public class Image {
	@XmlAttribute
	private String src;
	@EqualsAndHashCode.Include
	@XmlAttribute
	private String name;
	private int hOffset;
	private int vOffset;
    @XmlJavaTypeAdapter(AlignmentAdapter.class)
    private TipoAlignment alignment;
}
	