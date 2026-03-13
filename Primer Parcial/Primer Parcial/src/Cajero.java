public class Cajero {

    private String sucursal;

    public Cajero(String sucursal){
        this.sucursal = sucursal;
    }

    public Operacion retirarDinero(Cuenta cuenta, double monto){

        if(cuenta.retirar(monto)){
            return new Operacion("Retiro", monto);
        }

        return null;
    }

    public Operacion depositarDinero(Cuenta cuenta, double monto){

        cuenta.depositar(monto);
        return new Operacion("Deposito", monto);

    }

    public Operacion consultarSaldo(Cuenta cuenta){
        return new Operacion("Consulta Saldo", 0);
    }

    public String getSucursal(){
        return sucursal;
    }


}
