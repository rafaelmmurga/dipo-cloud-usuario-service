package unam.diplomado.pixup.usuarioservice.domain;

public class UsuarioAlreadyExistsException extends RuntimeException{
	public UsuarioAlreadyExistsException(String Email) {
		super("Ya existe un usuario registrado con email: " + Email);
	}
}
