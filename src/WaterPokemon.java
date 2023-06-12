public class WaterPokemon extends Pokemon {

    private int height;
    private String food;
    public WaterPokemon(String name, int level, int height, String food) {
        super(name, level);
        this.height = height;
        this.food = food;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void swims() {
        System.out.println(this.getName() + " does not swim, only eats " + this.getFood());
    }

    public void changeName(String name) {
        this.setName(name);
        System.out.println(this.getName());
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " doesn't eat, drinks only.");
    }
}
