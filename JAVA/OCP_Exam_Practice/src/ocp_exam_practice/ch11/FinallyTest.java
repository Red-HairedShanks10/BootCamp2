package ocp_exam_practice.ch11;



public class FinallyTest {
    public static void main(String[] args) {

    }

    void explore(){
        try{
            seeAnimals();
            fall();
        }catch (Exception e) {
             getHugFromDaddy();
        } finally {
             seeMoreAnimals();
            }
         goHome();
    }

    void fall(){

    }


}

