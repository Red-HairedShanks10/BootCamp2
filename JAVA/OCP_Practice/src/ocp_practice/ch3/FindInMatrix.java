/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocp_practice.ch3;

/**
 *
 * @author Marco
 */
public class FindInMatrix {

    /**
     * 
     */
        public static void main(String[] args) {
        int[][] list = {{1,13},{5,2},{2,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
        break PARENT_LOOP;
                }
            }
        }
    if(positionX==-1|| positionY==-1){
        System.out.println("Value "+searchValue+" not found");
    }else {
        System.out.println("Value "+searchValue+" found at: " + "("+positionX+","+positionY+")");
        }
    }
    
}
