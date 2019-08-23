package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continentList = new ArrayList<>();

    public void addContinents(Continent continent){
        continentList.add(continent);
    }

    BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(a -> a.getCountryList().stream())
                .map(country -> country.getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
