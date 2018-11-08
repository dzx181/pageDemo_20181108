package com.example.demo.service.impl;

import com.example.demo.dao.BusStationDao;
import com.example.demo.entity.BusStation;
import com.example.demo.service.BusStationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * @author dengzhenxiang
 * @Date 2018/11/8 9:29
 * @Version
 */
@Service
public class BusStationServiceImpl implements BusStationService {
	@Autowired
	private BusStationDao busStationDao;
	//分页逻辑
	@Override
	public String findBusStations(Integer page,HttpServletRequest httpServletRequest) {
		if (page == null){ page = 0;}
		//page为初始页，pageSize表一页显示多少条
		PageHelper.startPage(page,10);
		List<BusStation> list = busStationDao.findBusStations();
		PageInfo pageInfo = new PageInfo(list);
		httpServletRequest.setAttribute("pageInfo",pageInfo);
		httpServletRequest.setAttribute("list",list);
		return "hello";
	}
}
