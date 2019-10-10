package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
public static void main(String[] args) {
	
	ArrayList<Employee> arrayList=new ArrayList<Employee>();
	arrayList.add(new Employee("manoj",11));
	arrayList.add(new Employee("aman",12));
	arrayList.add(new Employee("raman",20));
	arrayList.add(new Employee("bunny",35));
	System.out.println(arrayList);
	/*Collections.sort(arrayList,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
	System.out.println(arrayList);*/
	Collections.sort(arrayList,(i1,i2)->i2.getEmpNo().compareTo(i2.getEmpNo()));
	System.out.println(arrayList);
}
}
