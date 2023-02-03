package ejerciciosJSON_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder

public class Examen {
	
	@EqualsAndHashCode.Include
	@NonNull
	@SerializedName("$id")
	private String id;
	@SerializedName("MCER")
	private String mcer;
	@SerializedName("Nivel")
	private String nivel;
	@SerializedName("ID")
	private String id2;
	@SerializedName("Titulo")
	private String titulo;
	@SerializedName("Horario")
	private String horario;
	@SerializedName("InicioImparticion")
	private LocalDateTime inicioImparticion;
	@SerializedName("FinImparticion")
	private LocalDateTime finImparticion;
	@SerializedName("Horas")
	private int horas;
	@SerializedName("URL")
	private String url;
	@SerializedName("TipoFormacion")
	private TipoFormacion tipoFormacion;
	@SerializedName("ECTS")
	private String ecets;
	@SerializedName("Categoria")
	private String categoria;
	@SerializedName("Profesorado")
	private List<Profesor> profesorado;
	
}
