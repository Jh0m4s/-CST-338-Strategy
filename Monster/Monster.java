package Monster;
/**
 * Name: Joey Thomas
 * Date: 3/1/2019
 * Explanation: This is an abstract class that outlines monster
 */

import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    Integer hp;
    Integer xp;
    Integer maxHp;
    HashMap<String, Integer> items;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
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
