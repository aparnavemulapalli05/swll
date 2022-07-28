package com.advance.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeA {

	public static void main(String[] args) {
		Deque<String> editHistory= new ArrayDeque<>();
		System.out.println("Taking action:null");
		editHistory.push("null");
		System.out.println("Taking action:make the text bold");
		editHistory.push("make the text bold");
		System.out.println("Taking action:adding some text");
		editHistory.push("adding some text");
		System.out.println("Taking action:adding new paragraph");
		editHistory.push("adding new paragraph");
		System.out.println();
		System.out.println("last action in our edit history:" +editHistory.peek());
		System.out.println("undoing the last action:" +editHistory.pop());
		System.out.println("undoing the last action:" +editHistory.pop());
		System.out.println();
		System.out.println("Taking action:making the text italic");
		editHistory.push("making the text italic");
		


	}

}
