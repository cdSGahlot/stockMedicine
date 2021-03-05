package com.cognizant.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.demo.dao.MedicineStockDAO;
import com.cognizant.demo.model.Medicine;

@RestController
public class StockController {
	
	@Autowired
	MedicineStockDAO dao;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("MedicineStockInformation")
	public List<Medicine> getMedicineList(){
		List<Medicine> medicine = new ArrayList<>();
		dao.findAll().forEach(medicine::add);
		return medicine;
	}
	
}
