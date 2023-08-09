import Accessories.*;
import Accessories.Keyboard.KeyboardType;
import Accessories.Monitor.DisplayType;
import Accessories.Ram.RamType;
import Accessories.Storage.StorageType;

public class Main {
    public static void main(String[] args) {
        Computer macbook = new Computer("Apple", "MacBook");
        Cpu cpu = new Cpu(2, 2, "Intel", 2);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, true, 2);
        Monitor monitor = new Monitor(1.5, DisplayType.IPS, 2);
        Ram ram = new Ram(RamType.DDR5, 2, 2);
        Storage storage = new Storage(StorageType.HDD, 2, 2);

        macbook.setCpu(cpu);
        macbook.setKeyboard(keyboard);
        macbook.setMonitor(monitor);
        macbook.setRam(ram);
        macbook.setStorage(storage);

        String infoMacbook = macbook.toString();
        System.out.println(infoMacbook);
    }
}