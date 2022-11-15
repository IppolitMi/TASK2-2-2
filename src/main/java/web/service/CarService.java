package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(int count);

    List<Car> getCars(int count);
}