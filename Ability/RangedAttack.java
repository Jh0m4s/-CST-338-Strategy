package Ability;
import Monster.*;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: Implements Attack as ranged attack
 */
public class RangedAttack implements Attack{

    Monster attacker;

    public RangedAttack(Monster monster){
        this.attacker = monster;
    }

    public Integer attack(Monster target){
        String message = attacker +  " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }

}
