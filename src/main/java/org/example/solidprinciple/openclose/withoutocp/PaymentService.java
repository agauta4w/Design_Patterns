package org.example.solidprinciple.openclose.withoutocp;

public class PaymentService {

    //so issue here is like we already have some payment option for our app like through upi
    //in case we are expecting international transaction, and we are going to add logic for paypal payment
    //in that case we need to modify our existing working code which violets ocp

    //for fix we can create one interface as pay, and we can create diff payment methods

    public void processPayment(String type){
        if(type.equals("UPI")){
            System.out.println("Payment processing via UPI");
        }
        else if (type.equals("Credit card")){
            System.out.println("Processing cc payment");
        } else if(type.equals("Net Banking")){
            System.out.println("Processing payment through net banking");
        }
    }
}
