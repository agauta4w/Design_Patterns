package org.example.solidprinciple.dependencyInversion.withoutDIP;

public class MongoDb {

    public void storeDocument(String data){
        System.out.println("Storing document in mongodb : " + data);
    }
}
