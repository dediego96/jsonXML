package ejerciciosJSON_1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder

public class Direccion {
	
	private String calle;
	private String numero;
	private String pais;

}
