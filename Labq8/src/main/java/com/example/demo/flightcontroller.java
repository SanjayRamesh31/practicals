package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flightcontroller {
@Autowired
flightService service;
@GetMapping("/")
public List<flight> getList(){
	return service.findall();
}
@GetMapping("/{flightid}")
public flight getflight(@PathVariable int flightid) {
	return service.getflightbyid(flightid);
}
@PutMapping("/")
	public String update(@RequestBody flight f) {
		return service.update(f);
	}
@DeleteMapping("/")
public String delete(@RequestParam int id) {
	return service.deleteflightid(id);
}
@PostMapping("/")
public flight add(@RequestBody flight f) {
	return service.addnew(f);
}
}

