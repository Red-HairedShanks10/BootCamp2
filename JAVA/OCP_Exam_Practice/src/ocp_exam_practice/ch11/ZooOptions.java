package ocp_exam_practice.ch11;
import java.util.*;
public class ZooOptions {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel", "Bob"));
        System.out.println(props.get("open"));
    }
}
