package ejerciciosJSON_3;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Localidades {
	
	private List<Localidad> localidad;
	
	public Localidades() {
		localidad = new ArrayList<>();
	}
	
}



