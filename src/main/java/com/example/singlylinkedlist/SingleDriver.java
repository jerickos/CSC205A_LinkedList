package com.example.singlylinkedlist;

public class SingleDriver {
    public static void main(String[] args){
        LinkedList<String> LinkedList = new SinglyLinkedList<>();

        LinkedList.addFirst("First");
        LinkedList.addFirst("Second");
        LinkedList.addFirst("Third");
        LinkedList.addFirst("Fourth");
        LinkedList.addFirst("Fifth");

        LinkedList.addLast("sixth");
        LinkedList.addLast("seventh");
        LinkedList.addLast("eighth");


        System.out.println(LinkedList);

        System.out.println(LinkedList.contains("First"));
        System.out.println(LinkedList.contains("eighth"));
        System.out.println(LinkedList.contains("tenth"));


        System.out.println(LinkedList.peakFirst());
        System.out.println(LinkedList.peakLast());

        LinkedList.pollFirst();

        System.out.println(LinkedList);

        LinkedList.pollLast();

        System.out.println(LinkedList);

        LinkedList.clear();

        System.out.println(LinkedList);



    }
}
