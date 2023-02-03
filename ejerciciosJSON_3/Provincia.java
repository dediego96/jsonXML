package ejerciciosJSON_3;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Provincia {
	
	private Nombre nombre;
	private Localidades localidades;
	@SerializedName("_id")
	private String id;

}
