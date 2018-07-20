public class Card {

    int chiCost;
    String name;
    String school;
    DamageEffect effect;

    public DamageEffect getEffect(){
        return this.effect;
    }

    public Card(String name, DamageEffect effect, int chiCost, String school){
        this.name = name;
        this.effect = effect;
        this.chiCost = chiCost;
        this.school = school;
    }

}
