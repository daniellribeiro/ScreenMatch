package br.com.alura.screenmatch.exception;

public class FilmeNaoEncontradoException extends RuntimeException {
    public FilmeNaoEncontradoException(String message) {
        super(message);
    }
}
