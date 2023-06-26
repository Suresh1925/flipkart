package com.onesoft.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
@Autowired
OrderService os;
@PostMapping("/postone")
public String addOne(@RequestBody OrderEntity oe) {
	return os.addOne(oe);
}
//@PostMapping("/postall")
//public String addAll(@RequestBody List<OrderEntity> lo) {
//	return os.addAll(lo);
//}
@GetMapping("/getDatas")
public List<Object> getDatas(){
	return os.getDatas();
}

}

