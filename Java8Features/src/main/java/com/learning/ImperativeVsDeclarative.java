package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		
		//UseCase1 sum of 0 to 100
		
		//Imperative - how style of programming
		int sum = 0;
		for(int i=0;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("Imperative Style Of Approach Sum is::"+sum);
		
		//Declarative - what style of programming
		Integer sum1 = IntStream.rangeClosed(0,100).sum();
		
		
		//UseCase2 removing duplicate from list
		List<Integer> numberList= Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
		List<Integer> uniqueList = new ArrayList<Integer>();
		
		//Imperative style
		for(Integer number:numberList) {
			if(!uniqueList.contains(number)) {
				uniqueList.add(number);
			}
		}
		System.out.println("Imperative Style Of Approach::"+uniqueList);
		
		//Declarative Approach
		List<Integer> uniqueList1 = numberList.stream().distinct().collect(Collectors.toList());
	}

}
