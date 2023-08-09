package Accessories;

public class Ram {
    private RamType type;
    private double volumeMemory;
    private double weight;

    public Ram(RamType type, double volumeMemory, double weight) {
        this.type = type;
        this.volumeMemory = volumeMemory;
        this.weight = weight;
    }

    public RamType getType() {
        return type;
    }

    public double getVolumeMemory() {
        return volumeMemory;
    }

    public double getWeight() {
        return weight;
    }

    public enum RamType {
        DDR3, DDR4, DDR5
    }
}