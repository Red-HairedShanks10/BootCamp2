package book2.ch2;

public class EnumTest {
    public enum Blades {Naginata, Saber, Ngombe, Katana}
    public static void main(String[] args)
    {
        Blades nagi;//declare the variable with the enum as the data type
        nagi = Blades.Naginata;//can the enum variable bet set to only store values of the Blade data type?
        System.out.println("The blade is a " + nagi);
    }
}
