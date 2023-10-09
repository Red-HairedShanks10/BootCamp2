package ocp_exam_practice.ch11;

public class IllegalArgumentTest {
    int numberOfEggs;
    public static void main(String[] args) {

    }

    public void setNumberEggs(int numberEggs) {
        if(numberEggs < 0){
            throw new IllegalArgumentException("num of eggs must not be negative");
        }
        this.numberOfEggs = numberEggs;
    }
}
