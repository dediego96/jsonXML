package ejerciciosJSON_2;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString

public class Profesor {
	
	@EqualsAndHashCode.Include
	@NonNull
	@SerializedName("$id")
	private String id;
	@SerializedName("NombreCompleto") 
	private String nombreCompleto;

}
