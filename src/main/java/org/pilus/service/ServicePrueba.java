package org.pilus.service;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Filters;
import org.bson.BSONObject;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
import org.pilus.mapper.PruebaMapper;
import org.pilus.pojos.PruebaPOJO;
import java.lang.*;
import java.net.UnknownHostException;
import java.util.Objects;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class ServicePrueba {



    public static void connection() throws UnknownHostException {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://admin:admin@cluster0-66t9k.mongodb.net/sample_airbnb?retryWrites=true&w=majority");

        // Instancias codec para que haga la traduccion de BSON a POJO

        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                pojoCodecRegistry);

        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();

        //Conexion a la base
        //MongoClient mongoClient = MongoClients.create(
        //        "mongodb+srv://admin:admin@cluster0-66t9k.mongodb.net/sample_airbnb?retryWrites=true&w=majority");

        MongoClient mongoClient = MongoClients.create(clientSettings);

        MongoDatabase database = mongoClient.getDatabase("sample_airbnb");
       // MongoDatabase database = mongoClient.getDatabase("sample_airbnb").withCodecRegistry(pojoCodecRegistry);


        MongoCollection<PruebaPOJO> collection = database.getCollection("listingsAndReviews", PruebaPOJO.class);

        PruebaPOJO review = collection.find(eq("_id", "10051164")).first();
        System.out.println(review);

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
        prueba.setName("nombre cambiado");
    }

}
