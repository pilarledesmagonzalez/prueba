package org.pilus.service;

import com.mongodb.client.*;
import org.bson.Document;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

public class ServicePrueba {

    public static void getByID() {
        PruebaPOJO review = DBConnection.CollectionSelection().find(eq("_id", "10051164")).first();
        System.out.println(review);
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

}
