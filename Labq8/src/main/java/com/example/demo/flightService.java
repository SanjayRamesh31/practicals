package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class flightService {
	@Autowired 
	flightrepo repo;
	public List<flight> findall(){
		return repo.findAll();
	}
	public flight getflightbyid(int id) {
		return repo.findById(id).get();
	}
	public String update(flight f) {
			repo.save(f);
			return "flight details updated";
	}
	public String deleteflightid(int id) {
		repo.deleteById(id);
		return "flight details deleted";
	}
	public flight addnew(flight f) {
		return repo.save(f);
	}
}
