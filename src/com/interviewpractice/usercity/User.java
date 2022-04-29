package com.interviewpractice.usercity;

public class User {

String name;
int id;

public User() {
	super();
}

public User(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + "]";
}
}
