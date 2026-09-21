package org.example.solidprinciple.dependencyInversion.withoutDIP;

public class MySQLDb {

    public void saveData(String data){
        System.out.println("Saving data in db : " + data );
    }
}
