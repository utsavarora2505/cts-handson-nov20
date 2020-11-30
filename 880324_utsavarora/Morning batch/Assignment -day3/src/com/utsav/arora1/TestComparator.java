package com.utsav.arora1;
import java.util.*;
public class TestComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(123, "Laptop", 5236,3));
		list.add(new Items(256, "Mi TV", 5635,4));
		list.add(new Items(896, "AC", 7845,5));
		for(Items item : list) System.out.println(item);
		
		Comparator<Items> sortById = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getId() - i2.getId();
			}
		};	
	
	System.out.println("--- Sorting id by comparator in ascending order -----");
		Collections.sort(list, sortById); // sorting with Comparator
		for(Items item : list)  System.out.println(item);

	
	Comparator<Items> sortByR = new Comparator<Items>() {
		public int compare(Items i1, Items i2) {
			
			return i1.getRating() - i2.getRating();
		}	
	};
	
	System.out.println("-------------Sorting by rating--- ace----------");
	 Collections.sort(list, sortByR);
	 for (Items item :list) {
		 System.out.println(item);
	 }
	
		Comparator<Items> sortByRd = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				
				return i2.getRating() - i1.getRating();
			}	
		};
	
		
		System.out.println("-------------Sorting by rating--- dec----------");
		 Collections.sort(list, sortByRd);
		 for (Items item :list) {
			 System.out.println(item);
		 }
		
	
	
	
	}
}
