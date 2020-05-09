package org.pilus.service;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import java.net.UnknownHostException;


public class ServicePrueba {


    public static void connection() throws UnknownHostException {

        MongoClient mongoClient = new MongoClient();
        DB database = mongoClient.getDB("test");
        System.out.println(database.getName().toString());

    }

    public static void getInfo(PruebaPOJO prueba){
        prueba.setId(0);
        prueba.setName("nombre cambiado");
    }

}
