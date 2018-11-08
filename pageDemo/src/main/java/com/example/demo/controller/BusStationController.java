package com.example.demo.controller;

import com.example.demo.entity.BusStation;
import com.example.demo.service.BusStationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * @author dengzhenxiang
 * @Date 2018/11/8 9:29
 * @Version
 */
@Controller
public class BusStationController {
	@Autowired
	private BusStationService busStationService;


	@RequestMapping("/updatePage")
	public String updatePage(Integer page,HttpServletRequest httpServletRequest){
		return busStationService.findBusStations(page,httpServletRequest);
	}
}
