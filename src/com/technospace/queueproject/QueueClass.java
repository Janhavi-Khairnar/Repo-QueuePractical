package com.technospace.queueproject;

import java.util.Scanner;

public class QueueClass {

	int[] queue = new int[5];
	int front=-1;
	int rear=-1;
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	public void enqueue() {
		if(front == -1) {
			front = rear = 0;
			System.out.println("Enter the Number : ");
			num = sc.nextInt();
			queue[rear] = num;
		} else if(rear == queue.length-1){
			System.out.println("Queue is full.");
		} else {
			rear++;
			System.out.println("Enter the Number : ");
			num = sc.nextInt();
			queue[rear] = num;
		}
		
	}
	
	public static void main(String[] args) {
		
		QueueClass queueClass = new QueueClass();
		queueClass.enqueue();
		queueClass.enqueue();
		queueClass.enqueue();
		
	}

}
