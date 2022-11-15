package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car(1, "LADA", "Q"));
        list.add(new Car(2, "LADA1", "W"));
        list.add(new Car(3, "LADA2", "E"));
        list.add(new Car(4, "LADA3", "A"));
        list.add(new Car(5, "LADA4", "D"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars(int count) {
        return getCarList(count);
    }
}