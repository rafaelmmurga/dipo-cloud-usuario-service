package unam.diplomado.pixup.usuarioservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="municipios")
public class Municipio {
	
	@Id
	private String id;
	private String nombre;
	@DBRef
	private Estado estado;

}
