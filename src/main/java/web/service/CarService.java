package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"red",100));
        cars.add(new Car(2,"blue",150));
        cars.add(new Car(3,"black",250));
        cars.add(new Car(4,"white",350));
        cars.add(new Car(5,"green",450));
    }
    public List<Car> createCarList() {
        return cars;
    }
    public  List<Car> carsCount (List<Car> list, int number) {
        if (number <= 0 || number > 5) {
            return list;
        }
        return  list.stream().limit(number).toList();
    }
}
