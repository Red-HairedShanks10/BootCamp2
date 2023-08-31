package book4.ch6;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    @Override
    public String toString()
    {
        return name;
    }

    public Spell(String spellName, SpellType spellType, String spellDescription){

       this.name = spellName;
        this.type = spellType;
        description = spellDescription;
    }

}
