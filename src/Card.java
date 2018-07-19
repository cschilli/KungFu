public class Card {

    int chiCost;
    String name;
    String school;
    DamageEffect damageEffect;

    public Card(String name, DamageEffect damageEffect, int chiCost, String school){
        this.name = name;
        this.damageEffect = damageEffect;
        this.chiCost = chiCost;
        this.school = school;
    }

}
