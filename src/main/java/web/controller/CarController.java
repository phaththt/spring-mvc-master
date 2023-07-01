package web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count") Optional<Integer> count, ModelMap model){
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> cars = carService.getCars(count.orElse(0));
        model.addAttribute("cars", cars);
            return "cars";
    }
}
