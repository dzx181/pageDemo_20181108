package com.example.demo.dao;

import com.example.demo.entity.BusStation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author dengzhenxiang
 * @Date 2018/11/8 9:29
 * @Version
 */
@Mapper
public interface BusStationDao {
	List<BusStation> findBusStations();
}
