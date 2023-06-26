package com.onesoft.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
@Autowired
OrderDao od;

public String addOne(OrderEntity oe) {
	// TODO Auto-generated method stub
	return od.addOne(oe);
}

public List<Object> getDatas() {
	// TODO Auto-generated method stub
	return od.getDatas();
}

//public String addAll(List<OrderEntity> lo) {
//	// TODO Auto-generated method stub
//	return od.addAll(lo);
//}
}
