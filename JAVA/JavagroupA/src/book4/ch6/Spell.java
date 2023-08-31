package book4.ch6;

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
    public String toString()
    {
        return this.name;
    }


    ArrayList<Spell> spells = new ArrayList<>();
    spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
    spells.add(new Spell("Avis", Spell.SpellType.SPELL,"Launches birds from your wand."));
    spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
}
