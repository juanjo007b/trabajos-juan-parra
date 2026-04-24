package ui;

import repository.DataStore;
import service.ClienteService;
import util.InputUtil;

public class MenuClientes {

    private ClienteService service;
    private DataStore db;

    public MenuClientes(DataStore db) {
        this.db = db;
        this.service = new ClienteService(db);
    }

    public void mostrar() {

        System.out.println("1.Registrar");
        System.out.println("2.Listar");

        int op = InputUtil.leerInt();

        switch (op) {
            case 1 -> {
                System.out.print("Nombre: ");
                String n = InputUtil.leerTexto();

                System.out.print("Ocupacion: ");
                String o = InputUtil.leerTexto();

                service.registrar(n, o);
            }
            case 2 -> db.clientes.forEach(System.out::println);
        }
    }
}