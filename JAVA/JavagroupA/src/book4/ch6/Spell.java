package book4.ch6;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType, String spellDescription){

        name = spellName;
        type = spellType;
        description = spellDescription;
    }

}
