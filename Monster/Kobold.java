package Monster;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: This is a concrete class that extends the monster class, called Monster.Kobold
 */

import Ability.MeleeAttack;

import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHp, Integer xp, HashMap<String, Integer> items){
        super(maxHp, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}