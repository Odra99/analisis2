package project.analisis2.exception;

public class UsuarioNotFound extends RuntimeException{
    public UsuarioNotFound(String message){
        super(message);
    }
}
