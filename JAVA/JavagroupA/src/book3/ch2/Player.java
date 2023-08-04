package book3.ch2;

import java.util.Set;

public class Player {
    public  Player(){//constructor...

    }

    public static void main(String[] args) {

    }

    private int health;//variable field

    public int getHealth()//get accessor retrieves the field value
    {
        return this.health;
    }

    public void setHealth(int h)//set accessor sets the value of the field
    {
        this.health = h;
        if (this.health > 5 ){
            System.out.println(this.health);
        }else {
            System.out.println("health is to low!!! you might die my guy!!!");
        }
    }


}


