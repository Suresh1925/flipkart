package com.onesoft.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
@Autowired
OrderRepository or;

public String addOne(OrderEntity oe) {
	// TODO Auto-generated method stub
	or.save(oe);
	return "Single Product saved successfully";
}

public List<Object> getDatas() {
	// TODO Auto-generated method stub
	return or.getDatas();
}

//public String addAll(List<OrderEntity> lo) {
//	// TODO Auto-generated method stub
//	or.saveAll(lo);
//	return "List Of Products saved successfully";
//}
}
