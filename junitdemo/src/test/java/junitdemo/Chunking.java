package junitdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chunking {
	
	public static List<List<Integer>> chunk(List<Integer> list, int size, boolean discard) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		int listCount = list.size() / size;
		
		
		for (int i = 0; i < listCount; i++) {
			int start = i * size;
			int stop = start + size;
			
			lists.add(list.subList(start, stop));
		}
		
		int start = listCount * size;
		
		if(!discard && start < list.size()) {
			lists.add(list.subList(start, list.size()));
		}
		
		return lists;
	}
	
	public static List<List<Integer>> chunk2(List<Integer> list, int size, boolean discard) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			temp.add(list.get(i));
			
			if(temp.size() == size) {
				lists.add(temp);
				temp = new ArrayList<Integer>();
			}
		}
		
		if(!discard && temp.size() > 0 && temp.size() < size) {
			lists.add(temp);
		}
		
		return lists;
	}
	
	public static void main(String args[]) {
		System.out.println(chunk2(Arrays.asList(1,2,3,4,5,5,7,8,4), 2, false));
	}

}
