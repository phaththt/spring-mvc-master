package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count){
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("BMW", "black", 5));
            carList.add(new Car("Mercedes-Benz", "white", 2));
            carList.add(new Car("Lexus", "red", 11));
            carList.add(new Car("Toyota", "green", 13));
            carList.add(new Car("Kia", "grey", 15));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
