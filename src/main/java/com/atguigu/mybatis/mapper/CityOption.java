package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entity.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityOption {

    @Select("select * from city")
     List<City> getCities();

    @Select("select * from city where id=#{id}")
     City getCity(Integer id);

    @Insert("insert into city(name,state,country) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
     void insertCity(City city);
}
