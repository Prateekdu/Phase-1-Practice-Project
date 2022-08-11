package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
 @Id
 @GeneratedValue(Strategy=GenerationType.IDENTITY)
 private int cid;
 private String cname;
 private float fees;
 
}
