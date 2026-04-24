package ui;

import repository.DataStore;
import util.InputUtil;

public class MenuPrincipal {

    private DataStore db;

    public MenuPrincipal(DataStore db) {
        this.db = db;
    }

    public void iniciar() {

        int op;

        do {
            System.out.println("\n=== TURISAFE PRO ===");
            System.out.println("1.Clientes");
            System.out.println("2.Servicios");
            System.out.println("0.Salir");

            op = InputUtil.leerInt();

            switch (op) {
                case 1 -> new MenuClientes(db).mostrar();
                case 2 -> new MenuServicios(db).mostrar();
            }

        } while (op != 0);
    }
}