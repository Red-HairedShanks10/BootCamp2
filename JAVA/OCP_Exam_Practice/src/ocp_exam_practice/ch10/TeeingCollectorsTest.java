package ocp_exam_practice.ch10;

import java.util.List;
import static java.util.stream.Collectors.*;

public class TeeingCollectorsTest {
    public static void main(String[] args) {
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(teeing(
                        joining(" "),
                        joining(" "),
                        ((s, c) -> new Separations(s,c) )
                ));
        System.out.println(result);
    }
}
