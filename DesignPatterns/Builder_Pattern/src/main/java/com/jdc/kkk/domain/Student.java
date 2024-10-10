package com.jdc.kkk.domain;

public class Student {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String name;
	
	private String email;
	
	private String phone;
	
	private String address;
	
	public Student(String name, String email, String phone, String address) {
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder{
		private String name;
		
		private String email;
		
		private String phone;
		
		private String address;
		
		public Builder setName(String name) {
			this.name=name;
			return this;
		}
		public Builder setEmail(String email) {
			this.email=email;
			return this;
		}
		public Builder setPhone(String phone) {
			this.phone=phone;
			return this;
		}
		public Builder setAddress(String address) {
			this.address=address;
			return this;
		}
		
		public Student build() {
			return new Student(name,email,phone,address);
		}
	}
}
