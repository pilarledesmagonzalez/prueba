package org.pilus.app;

import org.pilus.controller.ControllerPrueba;
import org.pilus.pojos.PruebaPOJO;

public class App
{
    public static PruebaPOJO prueba = PruebaPOJO.builder().name("pilus").build();

    public static void main( String[] args ){
        new ControllerPrueba().connection();
    }
}
