package Ability;
import Monster.*;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: Ability.Attack holds a single method attack
 */
public interface Attack extends Ability {
    Integer attack(Monster monster);
}
