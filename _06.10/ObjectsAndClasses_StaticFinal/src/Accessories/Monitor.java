package Accessories;

public class Monitor {
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

    public enum DisplayType {
        IPS,
        TN,
        VA
    }
}