package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class flight {
@Id
private int flightid;
private String source;
private String destination;
private String takeofftiming;
public int getFlightid() {
	return flightid;
}
public void setFlightid(int flightid) {
	this.flightid = flightid;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getTakeofftiming() {
	return takeofftiming;
}
public void setTakeofftiming(String takeofftiming) {
	this.takeofftiming = takeofftiming;
}
public flight(int flightid, String source, String destination, String takeofftiming) {
	super();
	this.flightid = flightid;
	this.source = source;
	this.destination = destination;
	this.takeofftiming = takeofftiming;
}
public flight() {
	super();
	// TODO Auto-generated constructor stub
}
}
