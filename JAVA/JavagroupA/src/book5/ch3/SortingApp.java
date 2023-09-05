package book5.ch3;

public class SortingApp {


    public static void sort(int low, int high)
    {
        if (low >= high)
            return;
        int p = partition(low, high);
        sort (low, p);
        sort (p+1, high);
    }
}
