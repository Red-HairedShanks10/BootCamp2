package ocp_exam_practice.ch11;

public class TryCatchChain {
    public static void main(String[] args) {

    }

    public void visitOrca(){
        try{
            seeAnimal();
        }catch (AnimalsOutForAWalk e){
            System.out.println("sorry out for a swim🐳");
        }catch (ExhibitClosed e){
            System.out.println("sorry not today buddy🤣🤣🤣");
        }
    }

    public void seeAnimal(){

    }

}

class AnimalsOutForAWalk extends RuntimeException {}

class ExhibitClosed extends RuntimeException {}

class ExhibitClosedForLunch extends ExhibitClosed {}