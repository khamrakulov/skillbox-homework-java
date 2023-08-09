package Accessories;

public class Ram {
    private final String downAndfourSpace = PrivateMethods.downAndFourSpace();
    private final String downAndEightspace = PrivateMethods.downAndEightSpace();

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

    public String fullInfo() {
        String type = getType().toString();
        String volumeMemory = getVolumeMemory() + " GB";
        String weight = getWeight() + " kg";

        String info = "Ram:\n" +
                downAndEightspace + "Type: " + type +
                downAndEightspace + "VolumeMemory: " + volumeMemory +
                downAndEightspace + "Weight: " + weight;

        return info;
    }

    // enum
    public enum RamType {
        DDR3, DDR4, DDR5
    }
}