package org.pilus.controller;

import org.pilus.service.DBConnection;
import org.pilus.service.ServicePrueba;

/*
 * El controller llama un metodo cuya logica esta en el service
 * Aca solo decis lo que llamas y lo que devuelve
 */

public class ControllerPrueba {

    public void connection(){
        DBConnection.Connect();
        ServicePrueba.getByID();
        DBConnection.CloseDBConnection();
    }
}
