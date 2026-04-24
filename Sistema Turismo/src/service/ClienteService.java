package service;

import domain.Cliente;
import repository.DataStore;

public class ClienteService {

    private DataStore db;

    public ClienteService(DataStore db) {
        this.db = db;
    }

    public void registrar(String nombre, String ocupacion) {
        Cliente c = new Cliente("C" + (db.clientes.size() + 1), nombre, ocupacion);
        c.evaluar();
        db.clientes.add(c);
        db.guardar();
    }
}