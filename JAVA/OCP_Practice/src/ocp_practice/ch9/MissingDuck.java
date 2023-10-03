package ocp_practice.ch9;

public class MissingDuck {


    private String name;

    public MissingDuck(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(MissingDuck quack) {
        if (quack == null){
            throw new IllegalArgumentException("Poorly formed duck!");
        }



        if (this.name == null && quack.name == null) {
            System.out.println("Both names are null: ");
            return 0;
        }
        else if (this.name == null){
            System.out.println("this name is null");
            return -1;
        }
        else if (quack.name == null) {
            System.out.println("quack name is null");
            return 1;
        }
        else {return name.compareTo(quack.name);}
    }

    public static void main(String[] args) {
        MissingDuck mDuck1 = new MissingDuck("Kurama");
        MissingDuck mDuck2 = new MissingDuck("Kurapika");

        mDuck1.compareTo(mDuck1);
        mDuck2.compareTo(mDuck1);
        mDuck1.compareTo(mDuck2);


    }
}
