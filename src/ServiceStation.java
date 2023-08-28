class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName() + "\n======================");
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println("======================");
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName() + "\n======================");
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println("======================");
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName() + "\n======================");
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            System.out.println("======================");
        }
    }
}