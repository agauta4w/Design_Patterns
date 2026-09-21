package org.example.solidprinciple.dependencyInversion.withDIP;

public class UserService {

    private MySQLDb mySQLDb = new MySQLDb();
    private MongoDb mongoDb = new MongoDb();

    private DataBase db;

//    public void saveUser(String user){
//        mySQLDb.saveDataInSql(user);
//    }
//
//    public void saveUserInMongo(String user){
//        mongoDb.storeDocument(user);
//    }

    public UserService(DataBase dataBase){
        this.db = dataBase;
    }
    private void saveUserName(String name){
        db.saveData(name);
    }
}
