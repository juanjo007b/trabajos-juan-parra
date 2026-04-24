package service;

import repository.DataStore;
import domain.*;

public class ServicioService {

    private DataStore db;

    public ServicioService(DataStore db) {
        this.db = db;
    }

    public void crear(String clienteId) {

        Agente a = db.agenteDisponible();

        if (a == null) {
            System.out.println("No hay agentes disponibles");
            return;
        }

        Servicio s = new Servicio(
                "S" + (db.servicios.size() + 1),
                clienteId,
                a.id
        );

        a.disponible = false;
        db.servicios.add(s);

        System.out.println("Servicio creado: " + s);
    }
}