public class DamageEffect extends CardEffectAbstract {

    public DamageEffect(Player targetPlayer, int damageAmount){
        targetPlayer.lifeTotal = targetPlayer.lifeTotal - damageAmount;
    }

}
