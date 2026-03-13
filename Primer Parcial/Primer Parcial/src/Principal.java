import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Juan Perez", "1234");
        Cuenta cuenta = new Cuenta("Corriente", 435000);

        Cajero cajero = new Cajero("Sucursal Centro");
        Seguridad seguridad = new Seguridad();

        System.out.print("Ingrese su clave de 4 digitos: ");
        String clave = sc.nextLine();

        if(seguridad.validarClave(cliente, clave)){

            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");

            int opcion = sc.nextInt();

            Operacion op = null;

            if(opcion == 1){

                System.out.print("Monto a depositar: ");
                double monto = sc.nextDouble();

                op = cajero.depositarDinero(cuenta, monto);

            }
            else if(opcion == 2){

                System.out.print("Monto a retirar: ");
                double monto = sc.nextDouble();

                op = cajero.retirarDinero(cuenta, monto);

            }
            else if(opcion == 3){

                op = cajero.consultarSaldo(cuenta);

            }

            if(op != null){
                Comprobante comp = new Comprobante(op, cuenta, cajero);
                comp.mostrar();
            }

        }else{
            System.out.println("Clave incorrecta");
        }


    }
}
