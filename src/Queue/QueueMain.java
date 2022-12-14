package Queue;

import Node.MyNode;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure : Queue Program");
        Queue queueList = new Queue();
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        queueList.enqueue(firstNode);
        queueList.enqueue(secondNode);
        queueList.enqueue(thirdNode);
        queueList.printQueue();
        System.out.println("Queue after repeated dequeue : ");
        while(!queueList.isEmpty()) {
            queueList.dequeue();
            queueList.printQueue();
        }
    }
}
