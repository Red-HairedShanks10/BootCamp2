package book4.ch6;

import java.util.ArrayList;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType, String spellDescription){

       this.name = spellName;
        this.type = spellType;
        this.description = spellDescription;
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

        spells.add(new Spell("Amateratsu", Spell.SpellType.SPELL, "Produces inextinguishable black flames."));
        spells.add(new Spell("Spirit-Gun", Spell.SpellType.SPELL,"fires heavy spirit energy into a single beam"));
        spells.add(new Spell("Koto-amatsukami", Spell.SpellType.SPELL,"Projects Illusions that can inflict physical damage"));
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,"Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));


        /*for (Spell spell : spells){
            System.out.println(spell.name);
        }*/

        spells.stream().forEach(s -> System.out.println(s) );

        spells.stream().filter(s -> s.type == SpellType.SPELL).forEach(s -> System.out.println(s) );
    }



}
