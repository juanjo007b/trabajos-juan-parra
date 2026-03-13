import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public ArrayList<Libro> misLibros = new ArrayList<>();

    public Usuario(String n) { nombre = n; }

    public void tomar(Libro l) {
        if (l.disponible && misLibros.size() < 3) {
            l.disponible = false;
            misLibros.add(l);
            System.out.println("OK: " + l.titulo);
        } else {
            System.out.println("No disponible o límite alcanzado.");
        }
    }

    public void soltar(Libro l) {
        if (misLibros.remove(l)) {
            l.disponible = true;
            System.out.println("Devuelto: " + l.titulo);
        }
    }
}