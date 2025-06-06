package com.demo.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("perishable")
public class PerishableProduct extends Product {
     private LocalDate expdate;

	public PerishableProduct() {
		super();
	}

	public PerishableProduct(int pid, String pname, int qty, double price, LocalDate ldt,LocalDate expdate) {
		super(pid,pname,qty,price,ldt);
		this.expdate = expdate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return super.toString()+"PerishableProduct [expdate=" + expdate + "]";
	}
	
     
}
