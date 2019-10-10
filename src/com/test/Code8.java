package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code8 {
	
	public static void main(String[] args) {
		
	Integer arrays[] = {1,2,3,4,5,6,7,5,3,8,9,10};
	
	//1.convertArrayToArrayList
	ArrayList<Integer> arrayToArrayList=new ArrayList<>(Arrays.asList(arrays));
	System.out.println("final arrayList:"+arrayToArrayList);
	
	//2.oddNumber
	List<Integer>oddNumber=arrayToArrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println("oddNumber:"+oddNumber);
	
	//3.evenNumber
	List<Integer>evenNumber=arrayToArrayList.stream().filter(i->i%2 !=0).collect(Collectors.toList());
	System.out.println("evenNumber:"+evenNumber);
	
	//4.removeDuplicateNumber
	List<Integer>removeDuplicate=arrayToArrayList.stream().distinct().collect(Collectors.toList());
	System.out.println("removeDuplicate:"+removeDuplicate);
	
	//5.duplicateNumber
	arrayToArrayList.stream().filter(i ->Collections.frequency(arrayToArrayList, i)>1).collect(Collectors.toSet()).forEach(System.out::println);

	//6.sortingAsscendingOrder
	List<Integer>sortingAsscendingOrder=arrayToArrayList.stream().sorted().collect(Collectors.toList());
	System.out.println("sortingAsscendingOrder:"+sortingAsscendingOrder);
	
	//7.sortingReverseOrder
	List<Integer>sortingReverseOrder=arrayToArrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("sortingReverseOrder:"+sortingReverseOrder);
	
	//8.sumOfallNumber
	Integer sumOfallNumber=arrayToArrayList.stream().mapToInt(i->i.intValue()).sum();
	System.out.println("sumOfallNumber:"+sumOfallNumber);
	
	//9.maxNumber
	Optional<Integer> maxNumber=arrayToArrayList.stream().max(Comparator.naturalOrder());
	System.out.println("maxNumber:"+maxNumber);
	
	
	Optional<Integer> maxNumbers=arrayToArrayList.stream().reduce(Integer::max);
	System.out.println("maxNumber:"+maxNumbers);
	//10.minNumber
	Optional<Integer>minNumber=arrayToArrayList.stream().min(Comparator.naturalOrder());
	System.out.println("minNumber:"+minNumber);
	
	
	//11.counttotalNumber
	long count=arrayToArrayList.stream().count();
	System.out.println("count:"+count);
	
	//12.removingNumberOnGivenLength
	List<Integer>removingNumberOnGivenLength=arrayToArrayList.stream().skip(5).collect(Collectors.toList());
	System.out.println("removingNumberOnGivenLength:"+removingNumberOnGivenLength);
	
	
	//13.lowerCaseToUpperCase
	List<String> stringList=Arrays.asList("manoj");
	List<String>upperCase=stringList.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
	System.out.println("upperCase:"+upperCase);
	
	//14.lowerCaseToUpperCase second Way
	Function<String, String> lowerCase=s->s.toUpperCase();
	System.err.println(lowerCase.apply("manoj"));
	
	//15.upperCaseToLowerCase
	Function<String, String> upperCases=s->s.toLowerCase();
	System.out.println(upperCases.apply("MANOJ"));
	
	}
}
