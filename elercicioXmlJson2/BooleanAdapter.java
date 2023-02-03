package elercicioXmlJson2;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanAdapter extends XmlAdapter<String, Boolean>{

	@Override
	public Boolean unmarshal(String v) throws Exception {
		return v.equalsIgnoreCase("on");
	}
	
	@Override
	public String marshal(Boolean v) throws Exception {
		return v?"on":"off";
	}

}

