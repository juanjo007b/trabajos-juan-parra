public class Cuenta {

    private String tipo;
    private double saldo;
    private int retirosHoy;

    public Cuenta(String tipo, double saldoInicial){
        this.tipo = tipo;
        this.saldo = saldoInicial;
        this.retirosHoy = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean retirar(double monto){

        if(monto < 20000){
            System.out.println("Retiro minimo: 20000");
            return false;
        }

        if(monto > 400000){
            System.out.println("Retiro maximo: 400000");
            return false;
        }

        if(monto > saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }

        if(retirosHoy >= 3){
            System.out.println("Maximo 3 retiros por dia");
            return false;
        }

        saldo -= monto;
        retirosHoy++;

        return true;
    }

    // NUEVO METODO
    public void depositar(double monto){

        if(monto <= 0){
            System.out.println("Monto invalido");
            return;
        }

        saldo += monto;
    }
}
