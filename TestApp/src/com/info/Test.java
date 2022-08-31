package com.info;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Server> list=new ArrayList();
	
    Server one=new Server();
    one.setName("d1");
    one.setIp("192.1.1.2");
    one.setManufacture("HP");
    one.setRam(16);
    one.setNumProcessor(24);
    one.setPurchaseDate(LocalDate.parse("2022-01-01", DateTimeFormatter.ISO_DATE));
    list.add(one);
    
    Server two=new Server();
    two.setName("d2");
    two.setIp("192.2.2.3");
    two.setManufacture("Dell");
    two.setRam(16);
    two.setNumProcessor(20);
    two.setPurchaseDate(LocalDate.parse("2021-02-02", DateTimeFormatter.ISO_DATE));
    list.add(two);
    
    Server three=new Server();
    three.setName("d3");
    three.setIp("192.3.3.4");
    three.setManufacture("IBM");
    three.setRam(16);
    three.setNumProcessor(22);
    three.setPurchaseDate(LocalDate.parse("2019-02-02", DateTimeFormatter.ISO_DATE));
    list.add(three);

    Server four=new Server();
    four.setName("d4");
    four.setIp("192.4.4.5");
    four.setManufacture("Dell");
    four.setRam(32);
    four.setNumProcessor(26);
    four.setPurchaseDate(LocalDate.parse("2014-03-03", DateTimeFormatter.ISO_DATE));
    list.add(four);
    
    list.stream().filter(server->server.getManufacture().equalsIgnoreCase("Dell"))
    .forEach(server->System.out.println(server.getName()));
    
    System.out.println("------");

    list.stream().filter(server->server.getServerAge()>3)
    .forEach(s->System.out.println(s));
    
}
}
