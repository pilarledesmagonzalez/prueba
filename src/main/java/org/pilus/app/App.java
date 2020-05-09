package org.pilus.app;

import org.pilus.controller.ControllerPrueba;
import org.pilus.pojos.PruebaPOJO;
import java.net.UnknownHostException;
import static org.pilus.service.ServicePrueba.connection;

public class App
{
    public static PruebaPOJO prueba = PruebaPOJO.builder().id(1).name("pilus").build();

    public static void main( String[] args ) throws UnknownHostException {
        System.out.println(prueba.getId());
        System.out.println(prueba.getName());
        new ControllerPrueba().getInfo(prueba);
        System.out.println(prueba.getId());
        System.out.println(prueba.getName());
        connection();







        //asdasdasd

    }
}
