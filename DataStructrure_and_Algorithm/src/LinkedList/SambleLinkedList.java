package LinkedList;

import java.util.*;
import java.util.LinkedList;

public class SambleLinkedList {

	public static void main(String[] args) {
		// List<String> list = new java.util.LinkedList<String>();
		LinkedList<String> list = new LinkedList();

		list.add("Dharani ");
		list.add("Software ");
		list.add("Engineer");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}
	