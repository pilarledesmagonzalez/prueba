package org.pilus.service;

import com.mongodb.*;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import java.net.UnknownHostException;


public class ServicePrueba {


    public static void connection() throws UnknownHostException {

        MongoClient mongoClient = new MongoClient();
        DB database = mongoClient.getDB("test");
        DBCollection collection = database.getCollection("listingsAndReviews");
        DBObject query = new BasicDBObject("_id", "10006546");
        DBCursor cursor = collection.find(query);
        System.out.println(cursor.toString());


    }

    public static void getInfo(PruebaPOJO prueba){
        prueba.setId(0);
        prueba.setName("nombre cambiado");
    }

}
