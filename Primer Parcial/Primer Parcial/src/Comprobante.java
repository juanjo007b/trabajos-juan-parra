public class Comprobante {

    private Operacion operacion;
    private Cuenta cuenta;
    private Cajero cajero;

    public Comprobante(Operacion operacion, Cuenta cuenta, Cajero cajero){
        this.operacion = operacion;
        this.cuenta = cuenta;
        this.cajero = cajero;
    }

    public void mostrar(){

        System.out.println("----- COMPROBANTE -----");
        System.out.println("TX: " + operacion.getId());
        System.out.println("Tipo: " + operacion.getTipo());
        System.out.println("Sucursal: " + cajero.getSucursal());
        System.out.println("Monto: " + operacion.getMonto());
        System.out.println("Fecha: " + operacion.getFecha());
        System.out.println("Saldo restante: " + cuenta.getSaldo());
        System.out.println("-----------------------");

    }
}
