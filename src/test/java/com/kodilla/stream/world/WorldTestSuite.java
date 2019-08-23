package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        World world = new World();
        Continent continent = new Continent();
        continent.addCountry(new Country("Polska"));
        continent.addCountry(new Country("Japonia"));
        continent.addCountry(new Country("Rosja"));
        continent.addCountry(new Country("Grecja"));
        world.addContinents(continent);

        BigDecimal expectedQuantity = new BigDecimal("2000000");
        System.out.println(world.getPeopleQuantity());

        Assert.assertEquals(expectedQuantity, world.getPeopleQuantity());
    }
}
