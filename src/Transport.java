abstract public class Transport implements UpdateTyre {
    final String modelName;
    final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        System.out.println("Проверяем " + getModelName() +
                "\n======================");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}