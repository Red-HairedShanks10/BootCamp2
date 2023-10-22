package com.example.lambda.extra_Lambda_Examples;

import com.example.lambda.SalesTxn;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author MikeW
 */
public class A08Unary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    UnaryOperator<String> unaryStr = 
        s -> s.toUpperCase();
    
      System.out.println("== Upper Buyer");
      System.out.println(
          unaryStr.apply(first.getBuyerName()));
  }
}
