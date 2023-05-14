package com.example.demo;

import com.example.demo.WeatherResponse.MainData;

public class WeatherResponse {
private MainData main;
public MainData getMain() {
return main;
}
public void setMain(MainData main) {
this.main = main;
}
public static class MainData {
private double temp;
public double getTemp() {
return temp;
}
public void setTemp(double temp) {
this.temp = temp;
}
}
}
