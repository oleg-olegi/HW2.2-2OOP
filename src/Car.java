public class Car extends CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
        System.out.println("======================");
    }
}