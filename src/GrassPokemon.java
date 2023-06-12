public class GrassPokemon extends Pokemon{

    private String sound;
    private String special;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public GrassPokemon(String name, int level, String sound, String special) {
        super(name, level);
        this.sound = sound;
        this.special = special;
    }

    public void attackBuddy(Integer number, Pokemon pokemon) {
        System.out.println(this.getName() + " attacks " + pokemon.getName());
        pokemon.setLevel(pokemon.getLevel() - number);
        System.out.println(pokemon.getLevel());
    }

    public void makeSound() {
        System.out.println(this.getName() + " makes the sound " + this.sound);
    }


    @Override
    public void eats() {
        System.out.println(this.getName() + " eats only plantbased.");
    }
}
