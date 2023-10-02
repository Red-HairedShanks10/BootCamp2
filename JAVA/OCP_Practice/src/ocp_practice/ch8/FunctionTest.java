package ocp_practice.ch8;

public class FunctionTest {
    public static void main(String[] args) {
        //
    }

}




interface Function<T,R>{
    R apply(T t);//value returned by t will be converted to Value of R
}

interface BiFunction<T,U, R>{
    R apply(T t, U u);
}
