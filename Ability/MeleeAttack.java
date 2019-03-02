package Ability;
import Monster.*;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: Implements Attack as melee attack
 */
public class MeleeAttack implements Attack{

    Monster attacker;

    MeleeAttack(Monster monster){
        this.attacker = monster;
    }

    public Integer attack(Monster target){
        String message = attacker +  " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }

}
