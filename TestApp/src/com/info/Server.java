package com.info;

import java.time.LocalDate;
import java.time.Period;

public class Server {
	private String name;
	private String ip;
	private String manufacture;
	private int ram;
	private int numProcessor;
	private LocalDate purchaseDate;

	public Server() {
		super();
	}

	public Server(String name, String ip, String manufacture, int ram, int numProcessor, LocalDate purchaseDate) {
		super();
		this.name = name;
		this.ip = ip;
		this.manufacture = manufacture;
		this.ram = ram;
		this.numProcessor = numProcessor;
		this.purchaseDate = purchaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getNumProcessor() {
		return numProcessor;
	}

	public void setNumProcessor(int numProcessor) {
		this.numProcessor = numProcessor;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Server [name=" + name + ", ip=" + ip + ", manufacture=" + manufacture + ", ram=" + ram
				+ ", numProcessor=" + numProcessor + ", purchaseDate=" + purchaseDate + "]";
	}

	public long getServerAge() {
		Period p=purchaseDate.until(LocalDate.now());
		return p.getYears();
	}
}
//https://www.javacodegeeks.com/2015/12/using-java-8-lambdas-streams-aggregates.html#:~:text=Aggregate%20operations%20use%20internal%20iteration.%20Your%20application%20has,from%20a%20stream%2C%20not%20directly%20from%20a%20Collection.