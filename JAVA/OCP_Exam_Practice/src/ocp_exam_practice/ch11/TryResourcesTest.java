package ocp_exam_practice.ch11;

public class TryResourcesTest {
    public static void main(String[] args) {

    }
}


class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num) { this.num = num; }
    @Override public void close() {
        System.out.println("Closing: " + num);
    } }