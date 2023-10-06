package ocp_exam_practice.ch10;
import java.io.*;
import java.util.*;
import java.util.function.Supplier;


public class ExceptionCaseStudy {

    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    public void bad() throws IOException {
        Supplier<List<String>> s ;
        //= ExceptionCaseStudy::create;
    }

    public void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    public void wrapped() {
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
    }

    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } }

    public static void main(String[] args) {

    }
}
