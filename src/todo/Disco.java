package todo;

public class Disco {
    public String titulo;
    public String grupo;
    public Integer temas;
    public double duracion;

    public Disco() {
    }

    public Disco(String titulo, String grupo, Integer temas, double duracion) {
        this.titulo = titulo;
        this.grupo = grupo;
        this.temas = temas;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getTemas() {
        return temas;
    }

    public void setTemas(Integer temas) {
        this.temas = temas;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", grupo='" + grupo + '\'' +
                ", temas=" + temas +
                ", duracion=" + duracion +
                '}';
    }
}
