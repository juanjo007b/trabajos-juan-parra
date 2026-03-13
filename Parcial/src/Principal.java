
public class Principal {
    public static void main(String[] args){

        Cliente cliente = new Cliente ("Juan Parra", "1234");
        Cuenta cuenta = new Cuenta ("Cuenta Cde Ahorros", "Cuenta Corriente", 435000);
        Cajero cajero = new Cajero (cliente, cuenta);


    }


        }

