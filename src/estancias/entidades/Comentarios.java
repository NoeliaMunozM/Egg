
package estancias.entidades;

public class Comentarios {
    private int id;
    private String comentario;
    private Casas casa;

    public Comentarios(int id, String comentario, Casas casa) {
        this.id = id;
        this.comentario = comentario;
        this.casa = casa;
    }
   
   
    public Comentarios() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Casas getCasa() {
        return casa;
    }

    public void setCasa(Casas casa) {
        this.casa = casa;
    }
    
    
}
