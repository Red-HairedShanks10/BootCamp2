package ocp_exam_practice.ch11;

public class TryCatchChain {

    String animalName;
    public static void main(String[] args) {
        TryCatchChain tcc = new TryCatchChain();
        tcc.visitOrca();
    }

    public void visitOrca(){
        animalName = "Orca";
        try{
            seeAnimal(animalName);
        }catch (AnimalsOutForAWalk e){
            System.out.println("sorry out for a swim🐳");
        }catch (ExhibitClosed e){
            System.out.println("sorry not today buddy🤣🤣🤣");
        }

        public void visitOrca(){
            animalName = "Orca";
            try{
                seeAnimal(animalName);
            }catch (AnimalsOutForAWalk e){
                System.out.println("sorry out for a swim🐳");
            }catch (ExhibitClosed e){
                System.out.println("sorry not today buddy🤣🤣🤣");
            }
    }

    public void seeAnimal(String animal){
        System.out.println("Seeing: " + animal);
    }

}

class AnimalsOutForAWalk extends RuntimeException {}

class ExhibitClosed extends RuntimeException {}

class ExhibitClosedForLunch extends ExhibitClosed {}