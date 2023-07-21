package com.technospace.doublyendedqueue;

import java.awt.Choice;
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
	
	public void rear_delete() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is empty. So, can not delete item.");
		}	else{
			System.out.println("The item to be deleted :"+queue[rear]);
			rear--;
		}
	}
	public void display() {
		for(int i=front ; i<=rear ; i++) {
			System.out.println("  "+queue[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		DoublyEndedQueue doublyEndedQueue = new DoublyEndedQueue();
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("### Operation List ###");
			System.out.println("1)Insert From Front \n2)Insert From Rear \n3)Delete From Front \n4)Delete From Rear \n5)Display \n6)Exit");
			System.out.println("Enter the Operation Number :");
			choice = sc.nextInt() ;
			
			switch (choice) {
			case 1:
				doublyEndedQueue.front_insert();
				break;
			case 2:
				doublyEndedQueue.rear_insert();
				break;
			case 3:
				doublyEndedQueue.front_delete();
				break;
			case 4:
				doublyEndedQueue.rear_delete();
				break;
			case 5:
				doublyEndedQueue.display();
				break;
			case 6:
				System.out.println("Exit!!!");
				break;
			default:
				System.out.println("Invalid Operation Number.");
				break;
			}
		}while(choice != 7);
	}

}
