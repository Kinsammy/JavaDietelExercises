package revisionWithChief.animal;

public abstract  class Mammal extends Animal{
    private String mammaryGland;

    public String getMammaryGland() {
        return mammaryGland;
    }

    public void setMammaryGland(String mammaryGland) {
        this.mammaryGland = mammaryGland;
    }
}
