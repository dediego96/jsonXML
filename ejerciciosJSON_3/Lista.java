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

public class Lista {
	
	@SerializedName("provincia")
	private List<Provincia> provincias;
	
}
