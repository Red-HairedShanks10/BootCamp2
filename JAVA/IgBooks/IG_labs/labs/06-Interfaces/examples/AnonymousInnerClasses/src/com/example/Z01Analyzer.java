package com.example;
//ch6
//uses a regular class reference/instance...
//to print matching string values

public class Z01Analyzer {
  public static void main(String[] args) {
      
    String[] strList = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

    // AnalyzerTool instance
    AnalyzerTool analyzeTool = new AnalyzerTool();
    
    System.out.println("===Contains===");
    for(String currentStr:strList){
        //using the arrContains() of AnalyzerTool class 
      if  (analyzeTool.arrContains(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    }
  }  
}
