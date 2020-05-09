package org.pilus.controller;

import org.pilus.pojos.PruebaPOJO;
import org.pilus.service.ServicePrueba;

import java.net.UnknownHostException;

public class ControllerPrueba {


    /*
    * El controller llama un metodo cuya logica esta en el service
    * Aca solo decis lo que llamas y lo que devuelve
    */

    public void getInfo(PruebaPOJO prueba) {
        ServicePrueba.getInfo(prueba);
    }

    public void connection() throws UnknownHostException {
        ServicePrueba.connection();
    }
}
