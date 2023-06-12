public class ElectricPokemon extends Pokemon{

    private int defence;
    private int attack;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public ElectricPokemon(String name, int level, int defence, int attack) {
        super(name, level);
        this.defence = defence;
        this.attack = attack;
    }

    public void attack() {
        System.out.println(this.getName() + " do attack!");
    }

    public void defense() {
        System.out.println(this.getName() + " has high defense!");
    }
    @Override
    public void eats() {
        System.out.println(this.getName() + " eats batteries.");
    }
}
