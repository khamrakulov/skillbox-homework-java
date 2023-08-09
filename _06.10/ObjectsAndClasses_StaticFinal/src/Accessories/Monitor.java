package Accessories;

public class Monitor {
    private final String downAndfourSpace = PrivateMethods.downAndFourSpace();
    private final String downAndEightspace = PrivateMethods.downAndEightSpace();

    private double inch;
    private DisplayType type;
    private double weight;

    public Monitor(double inch, DisplayType type, double weight) {
        this.inch = inch;
        this.type = type;
        this.weight = weight;
    }

    public double getInch() {
        return inch;
    }

    public DisplayType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String fullInfo(){
        String inch = getInch() + " inch";
        String type = getType().toString();
        String weight = getWeight() + " kg";

        String info = "Monitor:\n" +
                downAndEightspace + "Inch: " + inch +
                downAndEightspace + "Type: " + type +
                downAndEightspace + "Weight: " + weight;

        return info;
    }

    // enum
    public enum DisplayType {
        IPS,
        TN,
        VA
    }
}