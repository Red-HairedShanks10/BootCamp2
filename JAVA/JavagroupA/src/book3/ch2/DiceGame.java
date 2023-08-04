package book3.ch2;
/*Example shows you cant declare more than one public classs in one file*/

public class DiceGame
{
    public static void main(String[] args)
    {
        Dice d = new Dice();
        d.roll();
    }
}


/*cant make it public bcoz theres public class already!!
public class Dice

{
    public void roll()
    {
// code that rolls the dice goes here
    }
}*/


//instead create a class without stating visibility field
class Dice
{
    public void roll()
    {
// code that rolls the dice goes here
    }
}
