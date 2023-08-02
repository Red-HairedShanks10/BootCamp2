package book2.ch2;

public class EnumTest {
    public enum Blades {Naginata, Saber, Ngombe, Katana}
    public static void main(String[] args)
    {
        Blades nagi;
        nagi = Blades.Naginata;
        System.out.println("The blade is a " + nagi);
    }
}
