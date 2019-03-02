package Monster;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: This is a concrete class that extends the monster class, called Monster.Kobold
 */

import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHp, Integer xp, HashMap<String, Integer> items){
        super(maxHp, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}