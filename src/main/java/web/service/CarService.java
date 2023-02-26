package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarByCount(int count);

    public List<Car> getAllCar();
}
