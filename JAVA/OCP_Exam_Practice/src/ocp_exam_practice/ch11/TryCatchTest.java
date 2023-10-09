package ocp_exam_practice.ch11;

public class TryCatchTest {
    public static void main(String[] args) {

    }

void explore(){
        try{
            fall();
            System.out.println("never get here");
        }catch (RuntimeException e){
            getUp();
        }
    }

}
