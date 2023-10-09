package ocp_exam_practice.ch11;

public class Bunny {
    public static void main(String[] args)  {

        try{
            eatCarrot(3);
            }catch (NoMoreCarrotsException e){
                System.out.println("eatCarrot error: " + e);
            }

    }

    private static void eatCarrot(int carrotsEaten)throws  NoMoreCarrotsException{
       if (carrotsEaten <= 0) {
           throw new NoMoreCarrotsException();
       }else {
           System.out.println("eating the remaining " + carrotsEaten + " carrots");
       }

    }
}


class NoMoreCarrotsException extends Exception{

}