package Accessories;

public class Cpu {
    private final String downAndfourSpace = PrivateMethods.downAndFourSpace();
    private final String downAndEightspace = PrivateMethods.downAndEightSpace();

    private final double frequency;
    private final int countCores;
    private final String vendor;
    private final double weight;

    public Cpu(double frequency, int countCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.countCores = countCores;
        this.vendor = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCountCores() {
        return countCores;
    }

    public String getVendor() {
        return vendor;
    }

    public double getWeight() {
        return weight;
    }

    public String fullInfo(){
        String frequency = getFrequency() + " GHz";
        String cores = getCountCores() + " cores";
        String vendor = getVendor();
        String weight = getWeight() + " kg";

        String info = "CPU:\n" +
                downAndEightspace + "Frequency: " + frequency +
                downAndEightspace + "Number of cores: " + cores +
                downAndEightspace + "Vendor: " + vendor +
                downAndEightspace + "Weight: " + weight;

        return info;
    }
}
