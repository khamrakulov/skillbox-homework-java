package Accessories;

public class Storage {
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

    public enum StorageType {
        HDD,
        SSD
    }
}