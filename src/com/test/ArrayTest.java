package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayTest {
	
	public static void main(String[] args) {
		Integer array[]= {0,1,2,11,3,4,5,6,7,8,7,9};
		
		List<Integer> convertIntoList=new ArrayList<Integer>(Arrays.asList(array));
		long sum=convertIntoList.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("sum:"+sum);
		
		
		List<Integer>reverseOrder=convertIntoList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverseOrder:"+reverseOrder);
		
		List<Integer>asscendingOrder=convertIntoList.stream().sorted().collect(Collectors.toList());
		System.out.println("asscendingOrder:"+asscendingOrder);
		
		List<Integer>removeDuplicate=convertIntoList.stream().distinct().collect(Collectors.toList());
		System.out.println("removeDuplicate:"+removeDuplicate);
		convertIntoList.stream().filter(i ->Collections.frequency(convertIntoList,i)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		Long countNumber=convertIntoList.stream().count();
		System.out.println("countNumber:"+countNumber);
		
		
		Optional<Integer>MaxNumber=convertIntoList.stream().max(Comparator.naturalOrder());
		System.out.println("MaxNumber:"+MaxNumber);
		
		Optional<Integer>MinNumber=convertIntoList.stream().min(Comparator.naturalOrder());
		System.out.println("MinNumber:"+MinNumber);
		
		
	}
	
	
	

	
}
