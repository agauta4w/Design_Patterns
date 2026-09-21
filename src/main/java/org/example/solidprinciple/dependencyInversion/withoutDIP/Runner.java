package org.example.solidprinciple.dependencyInversion.withoutDIP;

public class Runner {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser("Ayush");
        userService.saveUserInMongo("Gautam");
    }
}
