package com.example;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	
	public Employee(){
		
	}
	
	public Employee(long emp_id){
		this.empId = emp_id;
	}
	
	public Employee(String firstName, String lastName, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
    public long getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	@Id
    @Column(name="emp_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long empId;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(name="gender", nullable = false)
    private String gender;
    @Column(name="dob")
    private Date dob;
//    @OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
//    private Set<OfficeLocation> officeLocations;
}