package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String name;
private String designation;
public void setId(int id) {
this.id = id;
}
public void setName(String name) {
this.name = name;
}
public void setDesignation(String designation) {
this.designation = designation;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public String getDesignation() {
return designation;
}
}
