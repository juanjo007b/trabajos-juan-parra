package repository;

import domain.*;
import java.io.*;
import java.util.*;

public class DataStore {

    public List<Cliente> clientes = new ArrayList<>();
    public List<domain.Agente> agentes = new ArrayList<>();
    public List<domain.Servicio> servicios = new ArrayList<>();

    private final String FILE = "data.txt";

    public void guardar() {
        try (PrintWriter pw = new PrintWriter(FILE)) {
            for (Cliente c : clientes) {
                pw.println("C," + c.getId() + "," + c.getNombre());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        agentes.add(new Agente("A1", "Carlos"));
        agentes.add(new Agente("A2", "Luisa"));
    }

    public Agente agenteDisponible() {
        return agentes.stream().filter(a -> a.disponible).findFirst().orElse(null);
    }
}