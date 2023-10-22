package com.example;
//ch6

//this example uses an interface reference: 
//to find all matching strings that contain a specified value

public class Z07Analyzer {
  
  //this method Searches all matching strings
    //that contain a specified value
    //then prints the matching strings
  public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    
    for(String currentStr:strList){
      if (analyzer.analyze(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
        }
    } 
  }
  
  public static void main(String[] args) {
      
    String[] strList = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";//specified string value
    System.out.println("Searching for: " + searchStr);
    
    
    //use the interface ref, to override the analyze() twice
    // Lambda expressions can be treated like variables
     //t arg is the sourceStr, s arg is the searchStr
    StringAnalyzer contains = (t, s) -> t.contains(s);    
    StringAnalyzer startsWith = (t, s) -> t.startsWith(s);

   
    //call the searchArr to print the matching strings
    System.out.println("==Contains==");
    Z07Analyzer.searchArr(strList, searchStr, 
      contains);
    
    System.out.println("==Starts With==");
    Z07Analyzer.searchArr(strList, searchStr, 
      startsWith);
  }    
}
