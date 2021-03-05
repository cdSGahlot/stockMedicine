package com.cognizant.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.cognizant.demo.model.Medicine;

public interface MedicineStockDAO extends CrudRepository<Medicine, String>{

}
