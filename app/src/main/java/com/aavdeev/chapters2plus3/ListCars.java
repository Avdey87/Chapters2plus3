package com.aavdeev.chapters2plus3;

import java.util.ArrayList;
import java.util.List;

public class ListCars {

    List<String> getListCars(String contry) {
        List<String> cars = new ArrayList<>();

        if (contry.equals("Germany")) {
            cars.add("BMW ");
            cars.add("Mersedes ");
            cars.add("AUDI ");
        }
        if (contry.equals("Koreya")) {
            cars.add("Kia ");
            cars.add("Huinday ");
            cars.add("Dohua ");
        }
        if (contry.equals("Japan")) {
            cars.add("Subaru ");
            cars.add("Mitshubisy ");
            cars.add("Suzuki ");
        }

        return cars;
    }
}
