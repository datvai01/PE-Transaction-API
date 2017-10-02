package com.pe.transaction.dto;

public class Transaction 
{	

	public int id;
	public String name;
	public String businessSegment;
	public int sla;
	
	public Transaction() {}
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param businessSegment
	 * @param sla
	 */
	public Transaction(int id, String name, String businessSegment, int sla) {
		super();
		this.id = id;
		this.name = name;
		this.businessSegment = businessSegment;
		this.sla = sla;
	}
	
	
	
	@Override
	public String toString() {
		return "TransactionDTO [id=" + id + ", name=" + name + ", businessSegment=" + businessSegment + ", sla=" + sla
				+ "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	public int getSla() {
		return sla;
	}
	public void setSla(int sla) {
		this.sla = sla;
	}
	
	
	
}
