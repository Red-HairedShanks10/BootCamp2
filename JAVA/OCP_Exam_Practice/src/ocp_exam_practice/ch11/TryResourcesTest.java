package ocp_exam_practice.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryResourcesTest {
    public static void main(String[] args) throws IOException {

      /*  try (var in = new FileInputStream("data.txt");
             var out = new FileOutputStream("output.txt");) {
            // Protected code
        } catch (IOException e) {
        // Exception handler
            System.out.println(e);
        } finally {
        // finally block
        }*/

       /* try (MyFileClass ab = new MyFileClass(1);
                MyFileClass cd = new MyFileClass(2)) {
        }
*/
        try (Scanner s = new Scanner(System.in)) {
            4: s.nextLine();
            5: } catch(Exception e) {
            6: s.nextInt(); // DOES NOT COMPILE
        } finally {
             s.nextInt(); // DOES NOT COMPILE


    }
}


class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) { this.num = num; }

    @Override public void close() {
        System.out.println("Closing: " + num);
    } }