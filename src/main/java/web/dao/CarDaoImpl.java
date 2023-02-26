package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        carList.add(new Car("TOYOTA", "BLACK", 150));
        carList.add(new Car("BMW", "GRAY", 250));
        carList.add(new Car("VAZ", "RED", 555));
        carList.add(new Car("NISSAN", "YELLOW", 250));
        carList.add(new Car("PORSCHE", "GREEN", 555));
    }

    @Override
    public List<Car> getCarByCount(int count) {
        return carList.subList(0, count);
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }
}