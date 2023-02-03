package ejerciciosJSON_3;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Localidad {
	
	@SerializedName("_c")
	private String c;
	@SerializedName("__cdata")
	private String cData;

}
