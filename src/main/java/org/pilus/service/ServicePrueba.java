package org.pilus.service;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import java.net.UnknownHostException;


public class ServicePrueba {


    public static void connection() throws UnknownHostException {


        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://admin:admin@cluster0-66t9k.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("sample_airbnb");

        System.out.println("Esto muestra la conexion al cluster, a una replica puntual, usando el puerto 27017");
        System.out.println(database.listCollections().cursor().getServerAddress());


        System.out.println("connected");


    }

    public static void getInfo(PruebaPOJO prueba){
        prueba.setId(0);
        prueba.setName("nombre cambiado");
    }

}
