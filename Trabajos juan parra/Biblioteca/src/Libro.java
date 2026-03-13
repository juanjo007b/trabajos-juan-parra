public class Libro {
    public String titulo;
    public boolean disponible = true;

    public Libro(String t) { titulo = t; }

    @Override
    public String toString() {
        return (disponible ? "[ ] " : "[X] ") + titulo;
    }
}