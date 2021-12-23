package com.atguigu.mybatis.entity;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class City {
   private Long id;
   private String name;
   private String state;
   private String country;

    public City(String name, String state, String country) {
        this.name = name;
        this.state = state;
        this.country = country;
    }
}
