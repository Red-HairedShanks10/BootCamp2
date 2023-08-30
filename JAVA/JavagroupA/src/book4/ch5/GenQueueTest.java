package book4.ch5;



public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("Zoro", "Roronoa"));
        hList.enqueue(new HourlyEmployee("Vinsmoke", "Sanji"));
        hList.enqueue(new HourlyEmployee("Rocks", "Xebec"));
        hList.enqueue(new HourlyEmployee(
                "Trump", "Donald"));
        hList.enqueue(new HourlyEmployee(
                "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Forbes", "Steve"));

    }
}
