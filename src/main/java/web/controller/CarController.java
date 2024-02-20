package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int allCars, Model model) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1,"red",100));
        cars.add(new Car(2,"blue",150));
        cars.add(new Car(3,"black",250));
        cars.add(new Car(4,"white",350));
        cars.add(new Car(5,"green",450));
        cars = CarService.carsCount(cars,allCars);

        model.addAttribute("cars", cars);
        return "cars";
    }

}
