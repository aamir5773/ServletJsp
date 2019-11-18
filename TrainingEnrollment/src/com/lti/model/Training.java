package com.lti.model;

public class Training {
	int id ;
	String course;
 int seats;
 
 
 public Training(){
	 
 }
 
public Training(int id, String course, int seats) {
	super();
	this.id = id;
	this.course = course;
	this.seats = seats;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
 
 
}