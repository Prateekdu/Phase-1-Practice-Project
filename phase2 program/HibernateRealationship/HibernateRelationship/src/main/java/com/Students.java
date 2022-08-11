package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Students {
	@Id
private int sid;
private String sname;
private int age;
@OneToMany
@JoinColumn(name="scid")  //foregin in course table 
private List<Course> listOfCourses;  // one student can do more than one course.

}
