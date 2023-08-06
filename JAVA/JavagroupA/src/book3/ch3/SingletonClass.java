package book3.ch3;

public class SingletonClass {

    public static void main(String[] args) {

    }
    private static SingletonClass instance;

    private SingletonClass(){
    }


    public static SingletonClass getInstance(){
            if (instance == null){
                instance = new SingletonClass();
            }
            return instance;
    }
}
