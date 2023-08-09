package Accessories;

public class Keyboard {
    private KeyboardType type;
    private boolean isBacklight;
    private double weight;

    public Keyboard(KeyboardType type, boolean isBacklight, double weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public double getWeight() {
        return weight;
    }

    public enum KeyboardType {
        MECHANICAL,
        MEMBRANE,
        OPTICAL,
        PROJECTION,
    }
}