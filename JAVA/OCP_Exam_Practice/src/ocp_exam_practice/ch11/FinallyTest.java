package ocp_exam_practice.ch11;



public class FinallyTest {
    public static void main(String[] args) {

    }

    void explore(){
        try{
            seeAnimals();
            fall();
        }catch (Exception e) {
             getHugFromPops();
        } finally {
             seeMoreAnimals();
            }
         goHome();
    }

     void goHome() {
    }

    void seeMoreAnimals() {
    }

    void fall(){
   throw new RuntimeException();
    }

    void seeAnimals(){

    }

    void getHugFromPops(){

    }


}

