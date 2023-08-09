import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CargoInfo cargo1 = new CargoInfo(
                5,
                6,
                7,
                5,
                "address",
                true,
                "id",
                false
        );

        // copying cargo1
        CargoInfo cargo2 = new CargoInfo(
            cargo1.getDimensions(),
            cargo1.getWeight(),
            cargo1.getAddress(),
            cargo1.getProperty(),
            cargo1.getId(),
            cargo1.getFragileness()
        );

        CargoInfo cargo3 = cargo1.setWeight(50);
    }
}