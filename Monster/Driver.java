package Monster;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: This class drives all extentions of Monster.Monster and does a couple tests.
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for(Monster m : monsters){
            System.out.println(m);
        }
    }
}
