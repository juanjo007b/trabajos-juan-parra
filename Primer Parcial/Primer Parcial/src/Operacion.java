import java.time.LocalDateTime;

public class Operacion {

    private static int contador = 1;

    private int id;
    private String tipo;
    private double monto;
    private LocalDateTime fecha;

    public Operacion(String tipo, double monto){
        this.id = contador++;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    public int getId(){
        return id;
    }

    public String getTipo(){
        return tipo;
    }

    public double getMonto(){
        return monto;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }
}
