package ocp_exam_practice.ch10;
import java.io.*;
import java.util.*;


public class ExceptionCaseStudy {

    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    public void bad() throws IOException {
        Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
    }

    public static void main(String[] args) {

    }
}
