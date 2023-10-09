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


    }

    public void visitLion(){
        animalName = "Lion";
        try{
            seeAnimal(animalName);
        }catch (ExhibitClosedForLunch e){
            System.out.println("sorry out for a hunt 🦁");
        }catch (ExhibitClosed e){
            System.out.println("Exhibit closed: sorry not today buddy🤣🤣🤣");
        }
    }

    public void seeAnimal(String animal){
        System.out.println("Seeing: " + animal);
        throw new ExhibitClosed();
       // throw new AnimalsOutForAWalk();
    }

}

class AnimalsOutForAWalk extends RuntimeException {}

class ExhibitClosed extends RuntimeException {}

class ExhibitClosedForLunch extends ExhibitClosed {}