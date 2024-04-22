package Heaps_and_hashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

//import practice.merge_k_sorted_lists.ListNode;

public class merge_k_sorted_lists {
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
			
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int listCount = sc.nextInt();
		int size = sc.nextInt();
		ListNode[] arr = new ListNode[listCount];
		
	   for (int i = 0; i<listCount; i++) {
		   ListNode mainNode = new ListNode();
		   ListNode dummy = mainNode;
		   
		   for (int j = 0; j<size; j++) {
			   ListNode temp = new ListNode();
			   temp.val = sc.nextInt();
			   mainNode.next = temp;
			   mainNode = temp;
		   }
		   arr[i] = dummy.next; 
		   
		  
	   }
	   
		
	   ListNode ans = mergeLists(arr);
	   finalAns(ans);

	}
	
	public static ListNode mergeLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val-o2.val;
			}
		});
		
		
		for (int i = 0; i<lists.length; i++) {
			if (lists[i] != null) {
				pq.add(lists[i]);
			}
		}
		
		ListNode Dummy = new ListNode();
		ListNode temp = Dummy;
		
		while(!pq.isEmpty()) {
			ListNode rv = pq.poll();
			Dummy.next = rv;
			Dummy = Dummy.next;
			if (rv.next != null) {
				pq.add(rv.next);
			}
		}
		
		return temp.next;
		
		
	}
	
	public static void finalAns(ListNode ll) {
		ListNode temp = ll;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

}
