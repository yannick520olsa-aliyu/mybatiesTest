package com.atguigu.mybatis;

import com.atguigu.mybatis.entity.City;
import com.atguigu.mybatis.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisDemoApplicationTests {

    @Autowired
    CityService cityService;
    @Test
    void contextLoads() {
        City city = cityService.getCity(1);
        System.out.println(city);
    }

    @Test
    void testall(){
        System.out.println(cityService.getCities());
    }

    @Test
    void insertCity(){
        City city = new City();
        city.setName("San Francisco");
        city.setState("CA");
        city.setCountry("US");
        cityService.insertCity(city);
    }
}
