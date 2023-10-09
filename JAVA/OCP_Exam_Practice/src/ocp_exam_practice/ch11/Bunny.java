package ocp_exam_practice.ch11;

public class Bunny extends Hopper {
    public static void main(String[] args)  {

        /*try{
            eatCarrot(3);
            }catch (NoMoreCarrotsException e){
                System.out.println("eatCarrot error: " + e);
            }

        try{
            eatCarrot(0);
        }catch (NoMoreCarrotsException e){
            System.out.println("eatCarrot error: no 🥕🥕🥕🥕🥕🥕😒!!");
        }

        eatCarrot(0);*/


    }

    public void hop() throws CanNotHopException{}

    private static void eatCarrot(int carrotsEaten)throws  NoMoreCarrotsException{
       if (carrotsEaten <= 0) {
           throw new NoMoreCarrotsException();
       }else {
           System.out.println("eating the remaining " + carrotsEaten + " 🥕🥕😊");
       }

    }
}


class NoMoreCarrotsException extends Exception{

}

class Hopper{
    public void hop() throws CanNotHopException{}
}

class CanNotHopException extends Exception{

}

