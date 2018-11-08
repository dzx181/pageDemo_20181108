package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author dengzhenxiang
 * @Date 2018/11/8 9:30
 * @Version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusStation {
	private Integer id;
	private String stationID;
	private String name;
	private String adCode;
	private String cityCode;
	private String lat;
	private String lng;

	
	
}
