package com.bridgeLabz.programs;

public class ArrayQueue
{
	private int capacity = 2;
    Customer qA[];
    int front = 0;
    int rear = -1;
    int size = 0;
    public ArrayQueue()
    {
    	qA = new Customer[this.capacity];
	}
    public void enqueue(Customer c) {
        
        if (isQueueFull()) {
            System.out.println("Queue is full, increase capacity...");
            increaseCapacity();
        }
        rear++;
        if(rear >= qA.length && size != qA.length){
            rear = 0;
        }
        qA[rear] = c;
        size++;
        System.out.println("Adding: " + c);
    }
    public Customer dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! No customer...");
            return null;
        } else {
            front++;
            size--;
            if(front > qA.length-1){
                System.out.println("removed: "+qA[front-1]);
                Customer c= qA[front-1];
                front = 0;
                return c;
            } else {
                System.out.println("removed: "+qA[front-1]);
                return qA[front-1];
            }
        }
    }
    //This method checks whether the queue is full or not
    public boolean isQueueFull(){
        boolean status = false;
        if (size == qA.length){
            status = true;
        }
        return status;
    }
    // This method checks whether the queue is empty or not
    public boolean isQueueEmpty(){
        boolean status = false;
        if (size == 0){
            status = true;
        }
        return status;
    }
    private void increaseCapacity(){
        //create new array with double size as the current one.
        int newCapacity = this.qA.length*2;
        Customer[] newArr = new Customer[newCapacity];
        //copy elements to new array, copy from rear to front
        int tmpFront = front;
        int index = -1;
        while(true){
            newArr[++index] = this.qA[tmpFront];
            tmpFront++;
            if(tmpFront == this.qA.length){
                tmpFront = 0;
            }
            if(size == index+1){
                break;
            }
        }
        //make new array as queue
        this.qA = newArr;
        System.out.println("New array capacity: "+this.qA.length);
        //reset front & rear values
        this.front = 0;
        this.rear = index;
    }
}
