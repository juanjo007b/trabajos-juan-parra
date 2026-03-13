package facturacion;

public class Factura {
    public void generar(String mascota, String servicio, String total) {
        System.out.println("\n--- TICKET VETERINARIO ---");
        System.out.println("PACIENTE: " + mascota);
        System.out.println("SERVICIO: " + servicio);
        System.out.println("TOTAL:    $" + total);
        System.out.println("--------------------------");
    }
}