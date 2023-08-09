public class CargoInfo {
    Dimensions dimensions; // габариты
    int weight; // масса
    String address; // адрес

    boolean property; // свойство — можно ли переворачивать
    String id; // регистрационный номер (может содержать буквы)
    boolean isFragile; // является ли груз хрупким

    public CargoInfo(
            Dimensions dimensions,
            int weight,
            String address,
            boolean property,
            String id,
            boolean isFragile
    ) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.property = property;
        this.id = id;
        this.isFragile = isFragile;
    }

    public CargoInfo(
            int width,
            int height,
            int length,
            int weight,
            String address,
            boolean property,
            String id,
            boolean isFragile
    ) {
        this.dimensions = new Dimensions(width, height, length);
        this.weight = weight;
        this.address = address;
        this.property = property;
        this.id = id;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }



    public int getWeight() {
        return weight;
    }



    public String getAddress() {
        return address;
    }



    public boolean getProperty() {
        return property;
    }

    public String getId() {
        return id;
    }

    public boolean getFragileness() {
        return isFragile;
    }

    // setters

    public CargoInfo setDimensions(Dimensions dimensions) {
        return new CargoInfo(
                dimensions,
                this.weight,
                this.address,
                this.property,
                this.id,
                this.isFragile
        );
    }

    public void setDimensions(int width, int height, int length) {
        this.dimensions = new Dimensions(width, height, length);
    }

    public CargoInfo setAddress(String address) {
        return new CargoInfo(
                this.dimensions,
                this.weight,
                address,
                this.property,
                this.id,
                this.isFragile
        );
    }

    public CargoInfo setWeight(int weight) {
        return new CargoInfo(
                this.dimensions,
                weight,
                this.address,
                this.property,
                this.id,
                this.isFragile
        );
    }
}
