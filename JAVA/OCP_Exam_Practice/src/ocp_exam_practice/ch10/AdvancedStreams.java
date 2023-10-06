package ocp_exam_practice.ch10;

public class AdvancedStreams {
        public static void main(String[] args) {
            var cats = new ArrayList<String>();
            26: cats.add("Annie");
            27: cats.add("Ripley");
            28: var stream = cats.stream();
             cats.add("KC");
             System.out.println(stream.count());
        }
}
