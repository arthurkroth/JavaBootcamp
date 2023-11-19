public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Tesla");
        car.setColor("Black");
        car.setModel("Model X");
        car.setDoors(2);
        car.setConvertible(false);
        car.describeCar();

        Car volks = new Car();
        volks.setMake("Volkswagen");
        volks.setColor("White");
        volks.setModel("Gol");
        volks.setDoors(4);
        volks.setConvertible(true);
        volks.describeCar();
        

    }
}
