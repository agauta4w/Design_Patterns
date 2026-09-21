package org.example.solidprinciple.dependencyInversion.withDIP;


public class Runner {
    public static void main(String[] args) {

//        userService.saveUser("Ayush");
//        userService.saveUserInMongo("Gautam");

        UserService userService = new UserService(new MongoDb());
        UserService userService2 = new UserService(new MySQLDb());

    }
}
