package com.technospace.doublyendedqueue;

import java.util.Scanner;

import com.technospace.queueproject.QueueClass;

public class DoublyEndedQueue {

	int queue[] = new int[5];
	int front = -1;
	int rear = -1;
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	public void front_insert() {
		if(front == -1 && rear == -1) {
				front = rear = 0;
				System.out.println("Enter the Numeber :");
				num = sc.nextInt();
				queue[front] = num;
		}	else if(front == 0 && rear == queue.length-1) {
				System.out.println("Queue is full.");
		}	else if (front == 0) {
				System.out.println("Now, from front side we can not insert the data .");
		}	else if(front == rear) {
				System.out.println("Operation is not allowed.");
		}	else {
				front--;
				System.out.println("Enter the Number :");
				num = sc.nextInt();
				queue[front] = num;
		}
	}
	
	public void rear_insert() {
		if(front == -1 && rear == -1) {
				front = rear = 0;
				System.out.println("Enter the Number :");
				num = sc.nextInt();
				queue[front] = num;
		} 	else if(rear == queue.length - 1) {
				System.out.println("Rear is reached at end. So, we can not insert data now.");
		}	else {
				rear++;
				System.out.println("Enter the Number :");
				num = sc.nextInt();
				queue[rear] = num;
		}
	}
	
	public void front_delete() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is empty. So, we can not delete the item.");
		}	else {
			System.out.println("The item to be delete :"+queue[front]);
			front++;
		}
	}
	
	public static void main(String[] args) {
		
		DoublyEndedQueue doublyEndedQueue = new DoublyEndedQueue();
		doublyEndedQueue.front_insert();
		doublyEndedQueue.front_insert();
		doublyEndedQueue.rear_insert();
		doublyEndedQueue.rear_insert();
		doublyEndedQueue.rear_insert();
		doublyEndedQueue.rear_insert();
		doublyEndedQueue.rear_insert();
		doublyEndedQueue.front_delete();
		doublyEndedQueue.front_delete();
		doublyEndedQueue.front_delete();
	}

}
