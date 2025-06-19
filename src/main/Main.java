package main;

import controllers.Controller;
import models.Modelo;
import views.Vista;

public class Main {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controller controller = new Controller(vista, modelo);
        vista.setVisible(true);
        
    }
    
}
