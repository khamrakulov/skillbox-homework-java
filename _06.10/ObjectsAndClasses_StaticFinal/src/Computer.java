import Accessories.Cpu;
import Accessories.Keyboard;
import Accessories.Keyboard.KeyboardType;
import Accessories.Monitor;
import Accessories.Monitor.DisplayType;
import Accessories.Ram;
import Accessories.Ram.RamType;
import Accessories.Storage;
import Accessories.Storage.StorageType;

public class Computer {
    private final String vendor;
    private final String name;

    // комплектующие
    private Cpu cpu = new Cpu(2, 2, "Intel", 2);
    private Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, true, 2);
    private Monitor monitor = new Monitor(1.5, DisplayType.IPS, 2);
    private Ram ram = new Ram(RamType.DDR5, 2, 2);
    private Storage storage = new Storage(StorageType.HDD, 2, 2);

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }


    // Геттеры и сеттеры для всех комплектующих
    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    // Метод расчёта общей массы компьютера
    public double getTotalWeight() {
        return cpu.getWeight() + keyboard.getWeight() + monitor.getWeight() + ram.getWeight() + storage.getWeight();
    }
}
