public class Pet {
    private final String name;
    private boolean clean;

    // Constructor
    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
