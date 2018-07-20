public class DamageEffect extends CardEffectAbstract {

    private int damageAmount;

    public int getDamage(){
        return this.damageAmount;
    }

    public DamageEffect(int damageAmount){
        this.damageAmount = damageAmount;
    }
}
