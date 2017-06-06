package com.tedu.service.impl;

import com.tedu.mapper.HouseMapper;
import com.tedu.pojo.House;
import com.tedu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/3.
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public List<House> findAll() {
        return houseMapper.findAll();
    }

    @Override
    public List<House> findListByAdd(String address) {
        return houseMapper.findListByAdd(address);
    }

    @Override
    public void saveHouse(House house) {
        house.setHouseId(UUID.randomUUID().toString());
        houseMapper.saveHouse(house);
    }

    @Override
    public void updateHouse(House house) {
        houseMapper.updateHouse(house);
    }

    @Override
    public House findOne(String houseId) {
        return houseMapper.findOne(houseId);
    }

    @Override
    public List<House> findListByUserId(String userId) {
        return houseMapper.findListByUserId(userId);
    }
}
