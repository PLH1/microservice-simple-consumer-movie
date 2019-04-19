package com.itmuchlearn.microservicesimpleconsumermovie.daomian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-19 11:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String userName;
    private  String name;
    private Integer age;
    private BigDecimal balance;

}
