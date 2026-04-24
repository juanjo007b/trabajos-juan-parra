package domain;

public class Servicio {

    public String id;
    public String clienteId;
    public String agenteId;
    public double costo;
    public String estado;

    public Servicio(String id, String c, String a) {
        this.id = id;
        this.clienteId = c;
        this.agenteId = a;
        this.costo = 100;
        this.estado = "ACTIVO";
    }

    public String toString() {
        return id + " | Cliente:" + clienteId + " | $" + costo + " | " + estado;
    }
}