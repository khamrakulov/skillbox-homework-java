package Accessories;

public class Keyboard {
    private final String downAndfourSpace = PrivateMethods.downAndFourSpace();
    private final String downAndEightspace = PrivateMethods.downAndEightSpace();

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

    public String fullInfo(){
        String type = getType().toString();
        String backlight = isBacklight ? "Yes" : "No";
        String weight = getWeight() + " kg";

        String info = "Keyboard:" +
                downAndEightspace + "Type: " + type +
                downAndEightspace + "Backlight: " + backlight +
                downAndEightspace + "Weight: " + weight;
        return info;
    }

    // enum
    public enum KeyboardType {
        MECHANICAL,
        MEMBRANE,
        OPTICAL,
        PROJECTION,
    }
}