package com.example.demo.service;



import javax.servlet.http.HttpServletRequest;

/**
 * @author dengzhenxiang
 * @Date 2018/11/8 9:30
 * @Version
 */
public interface BusStationService {
	String findBusStations(Integer page,HttpServletRequest httpServletRequest);
}
