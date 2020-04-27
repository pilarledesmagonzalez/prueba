package org.example;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {

    public static void main(String[] args){
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://admin:admin@pruebacursos-66t9k.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("pruebas");
        System.out.println("Connected");

    }



}