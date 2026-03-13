public class Seguridad {

    public boolean validarClave(Cliente cliente, String clave){

        if(clave.length() != 4){
            System.out.println("La clave debe tener 4 digitos");
            return false;
        }

        return cliente.getClave().equals(clave);

    }
}
