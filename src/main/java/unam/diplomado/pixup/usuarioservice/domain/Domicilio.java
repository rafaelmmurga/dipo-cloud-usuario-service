package unam.diplomado.pixup.usuarioservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Domicilio {
	@NotBlank(message="Calle no puede ser blanco")
	@Size(min=3, max=60, message="Calle debe contener entre {min} y {max}")
	private String calle;
	@NotBlank(message="Número Exterior no puede ser blanco")
	@Size(min=1, max=30, message="Número Exterior debe contener entre {min} y {max}")
	private String numExterior;
	private String numInteriorString;

}
