package br.com.alura.screenmatch.desafios;

public class Avaliacao <T> {
    private T item;
    private  Integer nota;
    private String comentario;
    
    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
