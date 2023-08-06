package book3.ch3;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass(){
    }


    public static SingletonClass getInstance(){
            if (instance == null){
                instance = new SingletonClass();
            }
            return instance;
    }


    public static void main(String[] args) {
        SingletonClass s1 = new SingletonClass.getInstance();
    }
}
