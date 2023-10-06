package ocp_exam_practice.ch10;

public class AdvancedStreams {
        public static void main(String[] args) {
            var cats = new ArrayList<String>();
             cats.add("Annie");
             cats.add("Ripley");
             var stream = cats.stream();
             cats.add("KC");
             System.out.println(stream.count());
        }
}
