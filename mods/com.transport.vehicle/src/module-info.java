module com.transport.vehicle {
    exports com.transport.vehicle.cars;
    provides com.transport.vehicle.cars.Car with com.transport.vehicle.cars.impl.CarImpl;
}