package book4.ch2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
        int year = 2004;
        for (int y = 0; y < 5; y++)
        {
            System.out.print(year + "\t");
            for (int region = 0; region < 4; region++){
                System.out.print(cf.format(sales[y][region]));
                System.out.print("\t");
            }
            year++;
            System.out.println();
        }
    }
}
