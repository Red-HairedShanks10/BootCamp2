package book4.ch5;



public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("Zoro", "Roronoa"));
        hList.enqueue(new HourlyEmployee("Vinsmoke", "Sanji"));

    }
}
