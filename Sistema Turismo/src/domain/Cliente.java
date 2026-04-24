package domain;

public class Cliente {

    private String id;
    private String nombre;
    private String ocupacion;
    private int score;
    private String estado;

    public Cliente(String id, String nombre, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.estado = "PENDIENTE";
    }

    public void evaluar() {
        if (ocupacion.toLowerCase().contains("senador")) {
            score = 50;
            estado = "RECHAZADO";
        } else {
            score = 0;
            estado = "APROBADO";
        }
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + estado + " | score:" + score;
    }
}