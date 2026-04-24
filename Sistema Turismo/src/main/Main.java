package main;

import repository.DataStore;
import ui.MenuPrincipal;

public class Main {

    public static void main(String[] args) {

        DataStore db = new DataStore();
        db.cargar();

        new MenuPrincipal(db).iniciar();
    }
}