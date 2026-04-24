package ui;

import repository.DataStore;
import service.ServicioService;
import util.InputUtil;

public class MenuServicios {

    private ServicioService service;
    private DataStore db;

    public MenuServicios(DataStore db) {
        this.db = db;
        this.service = new ServicioService(db);
    }

    public void mostrar() {

        System.out.println("1.Crear servicio");
        System.out.println("2.Listar");

        int op = InputUtil.leerInt();

        switch (op) {
            case 1 -> {
                System.out.print("Cliente ID: ");
                String id = InputUtil.leerTexto();
                service.crear(id);
            }
            case 2 -> db.servicios.forEach(System.out::println);
        }
    }
}