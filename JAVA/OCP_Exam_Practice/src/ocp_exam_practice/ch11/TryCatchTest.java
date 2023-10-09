package ocp_exam_practice.ch11;

public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tct = new TryCatchTest();

    }

void explore(){
        try{
            fall();
            System.out.println("never get here");
        }catch (RuntimeException e){
            getUp();
        }
        seeAnimals();
    }

    void seeAnimals(){
        System.out.println("Seeing Animals");
    };
    void fall(){throw  new RuntimeException();}

    void getUp(){
        System.out.println("getting up");
    }

}
