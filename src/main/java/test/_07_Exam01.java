package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class _07_Exam01 {
	private String feelsLike;
	private double temp;
	@Override public String toString(){ return feelsLike;}
	
	
	public _07_Exam01(String feelsLike, double temp) {
		super();
		this.feelsLike = feelsLike;
		this.temp = temp;
	}


	public String getFeelsLike() {
		return feelsLike;
	}


	public void setFeelsLike(String feelsLike) {
		this.feelsLike = feelsLike;
	}


	public double getTemp() {
		return temp;
	}


	public void setTemp(double temp) {
		this.temp = temp;
	}


	public static void main(String... season){
		List <_07_Exam01> readings=List.of(new _07_Exam01("HOT!",72),
		new _07_Exam01("Too Cold!",0),
		new _07_Exam01("Just right!",72));
		
//		readings
//		.parallelStream()	//k1
//		.collect(Collectors.groupingByConcurrent(
//				_07_Exam01::getTemp))	//k2
//		.forEach(System.out::print);	//k3
	
	
	}
}