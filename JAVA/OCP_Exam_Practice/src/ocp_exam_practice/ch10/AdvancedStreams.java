package ocp_exam_practice.ch10;

import java.util.ArrayList;

public class AdvancedStreams {
        public static void main(String[] args) {

            var cats = new ArrayList<String>();
             cats.add("Tora");
             cats.add("Leo");
             var stream = cats.stream();
             cats.add("Jaggy");
             System.out.println(stream.count());
        }
}
