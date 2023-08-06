package book3.ch3;

public class CountTestApp {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {//we use this loop to create about 10 instances(1-10)
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount()
                + " instances of the CountTest class.");
    }

}

class CountTest {
    private static int instanceCount = 0;

    public CountTest() {
        //since the instance count is used in the constructor//it will increment exactly as a new instance is created
        instanceCount++;
    }

    public static int getInstanceCount() {//since the constructor cant return a value// we use this method to do so
        return instanceCount;
    }


}
