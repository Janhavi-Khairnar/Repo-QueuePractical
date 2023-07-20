package com.technospace.circularqueue;

import java.util.Scanner;

import com.technospace.queueproject.QueueClass;

public class CircularQueue {

	int[] queue = new int[5];
	int front=-1;
	int rear=-1;
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	public void enqueue() {
		System.out.println("Before Enqueue \n Front :"+front+" \tRear :"+rear);
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
		System.out.println("After Enqueue \n Front :"+front+"\t Rear :"+rear);
	}
	
	public void dequeue() {
		if(front == -1 || front == queue.length) {
			System.out.println("Queue is empty.");
		} else{
			System.out.println("Element is deleted :"+queue[front]);
			front++;
			if(front == queue.length) {
				front = rear = -1;
			}
		}
	}
	
	public void display() {
		for(int i=front ; i<=rear ; i++) {
			System.out.println(queue[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		CircularQueue circularQueue = new CircularQueue();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("### Queue Operation ###");
			System.out.println("1)Enque \n2)Deque \n3)Dispaly");
			
			System.out.println("Enter the Operation :");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				circularQueue.enqueue();
				break;
			case 2:
				circularQueue.dequeue();
				break;
			case 3:
				circularQueue.display();
				break;
			default:
				System.out.println("You are enter the invalid number.");
				break;
			}
		}while(choice != 4);

	}

}
