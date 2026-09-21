package org.example.solidprinciple.dependencyInversion.withDIP;

public class MongoDb  implements DataBase{

//    public void storeDocument(String data){
//        System.out.println("Storing document in mongodb : " + data);
//    }

    @Override
    public void saveData(String name) {
        System.out.println("Storing data in mongo: "+ name);
    }
}
