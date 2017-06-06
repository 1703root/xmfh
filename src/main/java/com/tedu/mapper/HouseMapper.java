package com.tedu.mapper;

import com.tedu.pojo.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */

@Component
public interface HouseMapper {
    List<House> findAll();

    List<House> findListByAdd(String address);

    void updateHouse(House house);

    House findOne(String houseId);

    List<House> findListByUserId(String userId);

    void saveHouse(House house);
}
