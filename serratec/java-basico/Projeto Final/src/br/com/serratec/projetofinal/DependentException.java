package br.com.serratec.projetofinal;

public class DependentException extends RuntimeException{

    public DependentException(String message) {
        super(message);
    }

    public DependentException(Throwable cause) {
        super(cause);
    }

    public DependentException(String message, Throwable cause) {
        super(message, cause);
    }

    
}