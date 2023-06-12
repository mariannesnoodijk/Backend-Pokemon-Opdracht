public class Pokemon {

    private String name; // getters (and setters) aanmaken, want is private
    private int level; // getters (and setters) aanmaken, want is private

    public Pokemon(String name, int level) { // constructor
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void eats() {
        System.out.println(" ");
    }
}
