public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Pikachu", 2);
        FirePokemon firePokemon = new FirePokemon("Kaka", 3, 4, 5);
        ElectricPokemon electricPokemon = new ElectricPokemon("Koen", 10, 100, 90);
        WaterPokemon waterPokemon = new WaterPokemon("Bubbels", 10, 10, "soup");
        GrassPokemon grassPokemon = new GrassPokemon("Leafie", 4, "Wooohoo", "Special");
        electricPokemon.attack();
        waterPokemon.changeName("Ocean");


        pokemon.getName();
        firePokemon.eats();
        electricPokemon.eats();
        waterPokemon.eats();
        grassPokemon.eats();
        firePokemon.thunderPunch();
        firePokemon.fireLash();
        electricPokemon.defense();
        waterPokemon.swims();
        grassPokemon.attackBuddy(5, waterPokemon);
        grassPokemon.makeSound();
    }
}
