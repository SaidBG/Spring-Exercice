package fr.afpa.formation.entity;

public class Person {
private String firstName;
private String lastName;
private int year;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Person(String firstName, String lastName, int year) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.year = year;
}
@Override
public String toString() {
	return "firstName = " + firstName + 
			"lastName = " + lastName + 
			"year = " + year;
}


}
