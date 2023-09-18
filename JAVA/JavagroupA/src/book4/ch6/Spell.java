package book4.ch6;

import java.util.ArrayList;

public class Spell {
    public String name;
    public SpellType type;
    public String description;
    public int price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType, String spellDescription, int price){

       this.name = spellName;
        this.type = spellType;
        this.description = spellDescription;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Spell:" +
                "name: " + name + '\'' +
                ", type: " + type +
                ", description: {'" + description + '\'' +
                '}';
    }


    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();//arrayList of spells

        spells.add(new Spell("Amateratsu", Spell.SpellType.SPELL, "Produces inextinguishable black flames.",30));
        spells.add(new Spell("Spirit-Gun", Spell.SpellType.SPELL,"fires heavy spirit energy into a single beam",23));
        spells.add(new Spell("Koto-amatsukami", Spell.SpellType.SPELL,"Projects Illusions that can inflict physical damage",33));
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear.",4));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,"Launches birds from your wand.",3));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something.",25));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone.",330));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells.",3000));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs.",10));


        /*for (Spell spell : spells){
            System.out.println(spell.name);
        }*/

        //spells.stream().forEach(s -> System.out.println(s) );

            /*using pipeline of methods after converting collection to stream()*/
            spells.stream().filter(s -> s.type == SpellType.SPELL)
                .filter(s -> s.name.toLowerCase().startsWith("a"))
                .forEach(s -> System.out.println(s) );

       /*double Total = spells.stream()
               //.filter(s -> s.type == SpellType.SPELL)
                //.filter(s -> s.name.toLowerCase() //.startsWith("a"))
                .mapToDouble(s -> s.price )
                .sum();
       System.out.println("total price for all Spells is: " + Total);*/

/*        double Spellcount = spells.stream()
                //.filter(s -> s.type == SpellType.SPELL)
                //.filter(s -> s.name.toLowerCase() //.startsWith("a"))
                //.mapToDouble(s -> s.price )
                .count();

        System.out.println("Number of Spells is: " + Spellcount);*/

/*
        OptionalDouble avg = spells.stream()
                .mapToDouble(s -> s.price)
                .average();
                int avgC = (int) avg.getAsDouble();
                if (avg.isPresent()){
                    System.out.println("average price for all Spells is: " + avgC);
                }*/


        /* System.out.println("first paralleStream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));

        System.out.println("second paralleStream:");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));

        System.out.println("third second paralleStream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));

         */

    }



}
