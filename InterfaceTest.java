public class InterfaceTest {
    public static void main(String[] args) {
        Moveable plane = new Airplane();
        plane.move();

        Moveable car = new Car();
        car.move();
    }
}
