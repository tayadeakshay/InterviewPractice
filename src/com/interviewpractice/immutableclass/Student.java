package com.interviewpractice.immutableclass;

public final class Student {

	private final int rollNo;
	private final String name;
	private final Address address;

	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
		Address add = new Address();
		add.setCity(address.getCity());
		add.setPin(address.getPin());
		add.setCountry(address.getCountry());
		
		this.address = add;

	}
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		
		Address dummyAdd = new Address();
		
		dummyAdd.pin = address.getPin();
		dummyAdd.city = address.getCity();
		dummyAdd.country = address.getCountry();
		
		return dummyAdd;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	
	
	
	
}
