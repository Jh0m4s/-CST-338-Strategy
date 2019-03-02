package Ability;
import Monster.*;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: Implements Attack as melee attack
 */
public class MeleeAttack implements Attack{

    Monster attacker;

    public MeleeAttack(Monster monster){
        this.attacker = monster;
    }

    public Integer attack(Monster target){
        String message = attacker +  " uses a melee attack on " + target;
        System.out.println(message);
        // This can be less than zero for some reason, I'm not sure if I should take the absolute value of it or what.
        return attacker.getStr() - target.getDef();
    }

}
