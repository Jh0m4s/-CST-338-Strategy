package Monster;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: This is an abstract class that outlines monster
 */

import Ability.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHp;
    private HashMap<String, Integer> items;
    Integer agi = 0;
    Integer def = 0;
    Integer str = 0;
    Attack attack;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
    }


    public Integer attackTarget(Monster target){
        return attack.attack(target);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getXP(){
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    /**
     * @param min an integer
     * @param max an integer
     * @return a random integer between min and max
     */
    public Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        // Returns a random number between min and max inclusive
        return rand.nextInt(max-min)+min;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHp, monster.maxHp) &&
                Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, items);
    }

    @Override
    public String toString() {
        return "hp="+ hp + "/" + this.getMaxHp();
    }
}
