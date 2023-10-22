package com.example.lambda;
//ch9...2
import java.util.List;
import java.util.function.Consumer;

/**
 *Testing a consumer with lambda expressions
 * Consumer Interface takes in a generic type and returns nothing
 * ...it has a single Method called accept
 */
public class A02Consumer {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
    
    //using Consumer Interface reference: buyerConsumer
    //takes in SaleTxn type
    //using lambda to print our the 
    //Buyer's details by implementing the SalesTxn methods
    Consumer<SalesTxn> buyerConsumer = t -> 
        System.out.println("Id: " + t.getTxnId() 
            + " Buyer: " + t.getBuyerName());
    
    //perform a stream operation to list all buyerConsumers
    System.out.println("== Buyers - Lambda");
    tList.stream().forEach(buyerConsumer);
    
    //print the first Buyer
    System.out.println("== First Buyer - Method");
    buyerConsumer.accept(first);
  }
}
