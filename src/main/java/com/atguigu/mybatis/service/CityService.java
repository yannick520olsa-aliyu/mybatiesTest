package com.atguigu.mybatis.service;

import com.atguigu.mybatis.entity.City;
import com.atguigu.mybatis.mapper.CityOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityOption cityOption;

    public void insertCity(City city){
        cityOption.insertCity(city);
    }

    public City getCity(Integer id){
      return cityOption.getCity(id);
    }

    public List<City> getCities(){
        return cityOption.getCities();
    }
}
