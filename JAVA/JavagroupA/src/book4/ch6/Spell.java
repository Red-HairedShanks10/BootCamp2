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
        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Amateratsu", Spell.SpellType.SPELL, "Produces inextinguishable black flames.",3));
        spells.add(new Spell("Spirit-Gun", Spell.SpellType.SPELL,"fires heavy spirit energy into a single beam",3));
        spells.add(new Spell("Koto-amatsukami", Spell.SpellType.SPELL,"Projects Illusions that can inflict physical damage",3));
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear.",3));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,"Launches birds from your wand.",3));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something.",3));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone.",3));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells.",3));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs.",3));


        /*for (Spell spell : spells){
            System.out.println(spell.name);
        }*/

        //spells.stream().forEach(s -> System.out.println(s) );

        spells.stream().filter(s -> s.type == SpellType.SPELL)
                .filter(s -> s.name.toLowerCase().startsWith("a"))
                .forEach(s -> System.out.println(s) );
    }



}
