public class DamageEffect extends CardEffectAbstract {

    int damageAmount;

    public DamageEffect(Player targetPlayer, int damageAmount){
        this.damageAmount = damageAmount;
        targetPlayer.lifeTotal = targetPlayer.lifeTotal - damageAmount;
    }

}
