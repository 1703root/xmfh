package com.tedu.service;

import com.tedu.pojo.House;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
public interface HouseService {
    List<House> findAll();

    List<House> findListByAdd(String address);

    void saveHouse(House house);

    void updateHouse(House house);

    House findOne(String houseId);

    List<House> findListByUserId(String userId);

}
