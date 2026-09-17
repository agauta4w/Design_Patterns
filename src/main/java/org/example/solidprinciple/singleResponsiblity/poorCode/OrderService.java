package org.example.solidprinciple.singleResponsiblity.poorCode;


//srp : class should have only one reason to change

public class OrderService {

    //here in this class we have multiple reason to change like change in logic of order creation
    //or change in payment system from like upi to paypal etc.. or in sending notification from email to sms...
    //so here its violating single principle

    public void createOrder(){
        System.out.println("Order Created");
    }

    public  void createInvoice(){
        System.out.println("Invoice Generated");
    }

    public void sendEmail(){
        System.out.println("Email sent");
    }

    public void processPayment(){
        System.out.println("Payment Successful");
    }
}
