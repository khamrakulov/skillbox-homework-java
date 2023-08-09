package Accessories;

public class Storage {
    private final String downAndfourSpace = PrivateMethods.downAndFourSpace();
    private final String downAndEightspace = PrivateMethods.downAndEightSpace();

    private StorageType type;
    private int volumeMemory;
    private int weight;

    public Storage(StorageType type, int volumeMemory, int weight) {
        this.type = type;
        this.volumeMemory = volumeMemory;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }

    public int getVolumeMemory() {
        return volumeMemory;
    }

    public int getWeight() {
        return weight;
    }

    public String fullInfo() {
        String type = getType().toString();
        String volumeMemory = getVolumeMemory() + " GB";
        String weight = getWeight() + " kg";

        String info = "Storage:" +
                downAndEightspace + "Type: " + type +
                downAndEightspace + "Memory: " + volumeMemory +
                downAndEightspace + "Weight: " + weight;

        return info;
    }

    // enum
    public enum StorageType {
        HDD,
        SSD
    }
}