package org.example.solidprinciple.dependencyInversion.withoutDIP;

public class UserService {

    private MySQLDb mySQLDb = new MySQLDb();
    private MongoDb mongoDb = new MongoDb();

    public void saveUser(String user){
        mySQLDb.saveData(user);
    }

    public void saveUserInMongo(String user){
        mongoDb.storeDocument(user);
    }
}
