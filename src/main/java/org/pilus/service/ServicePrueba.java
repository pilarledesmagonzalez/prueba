package org.pilus.service;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Filters;
import org.bson.BSONObject;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import java.net.UnknownHostException;
import java.util.Objects;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;


public class ServicePrueba {


    public static void connection() throws UnknownHostException {


        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://admin:admin@cluster0-66t9k.mongodb.net/sample_airbnb?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("sample_airbnb");
        MongoCollection collection = database.getCollection("listingsAndReviews");
        findById("10051164",collection);
        mongoClient.close();
    }

    public static void readDocumentsFromDatabase(MongoCollection collection) {
        MongoCursor cursor = collection.find().cursor();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public static void findById(String id, MongoCollection collection)
    {
        Document myDoc = (Document) collection.find(eq("_id", id)).first();
        System.out.println(myDoc.toJson());

    }


    public static void getInfo(PruebaPOJO prueba){
        prueba.setId(0);
        prueba.setName("nombre cambiado");
    }

}
