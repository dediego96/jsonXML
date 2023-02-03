package elercicioXmlJson2;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AlignmentAdapter extends XmlAdapter<String, TipoAlignment>{

	@Override
	public TipoAlignment unmarshal(String v) throws Exception {
		return TipoAlignment.valueOf(v.toUpperCase());
	}

	@Override
	public String marshal(TipoAlignment v) throws Exception {
		return v.toString().toLowerCase();
	}

}
