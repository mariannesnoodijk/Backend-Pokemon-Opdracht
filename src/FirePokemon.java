public class FirePokemon extends Pokemon{
    private int hp;
    private int xp;

    public FirePokemon(String name, int level, int hp, int xp) {
        super(name, level);
        this.hp = hp;
        this.xp = xp;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void thunderPunch() {
        System.out.println(this.getName() + " uses thunder punch.");
    }

    public void fireLash() {
        System.out.println(this.getName() + " uses fire lash.");
    }
@Override
    public void eats() {
    System.out.println(this.getName() + " eats hot peppers.");
}
}
