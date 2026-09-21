package org.example.solidprinciple.dependencyInversion.withDIP;

public class MySQLDb  implements DataBase{

//    public void saveDataInSql(String data){
//        System.out.println("Saving data in db : " + data );
//    }

    @Override
    public void saveData(String data) {
        System.out.println("Saving data in sql db : " + data);
    }
}
