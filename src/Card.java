public class Card {

    int chiCost;
    String name;
    String school;
    CardEffectAbstract effect;

    public Card(String name, CardEffectAbstract effect, int chiCost, String school){
        this.name = name;
        this.effect = effect;
        this.chiCost = chiCost;
        this.school = school;
    }

}
