package unam.diplomado.pixup.usuarioservicedto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.pixup.usuarioservice.domain.Domicilio;
import unam.diplomado.pixup.usuarioservice.domain.Usuario;

@Data
@NoArgsConstructor
public class RegistroUsuarioRequest {
	
	@NotNull
	private Usuario usuario;
	private Domicilio domicilio;
	
}
