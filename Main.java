package com.collections_homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    MyLinkedList mll = new MyLinkedList();
	    mll.add(5);
	    mll.add(66);
	    mll.add(8);
	    mll.add(14);

	    System.out.println("my linked list: "+mll.toString());
	    mll.add(1,100);
	    System.out.println("my linked list: "+mll.toString());
	    System.out.println("my linked list size: "+mll.size());
        System.out.println(mll.get(3));
        System.out.println(mll.indexOf(8));
        mll.remove(2);
        //Integer[] a=mll.toArray();
		//System.out.println(Arrays.toString(a));
		mll.set(3,34);
		System.out.println("my linked list: "+mll.toString());

        Object[] myArray = mll.toArray();
        System.out.println(Arrays.toString(myArray));

        Object[] myObjArray = mll.toArray(Integer.class);

        mll.clear();
        System.out.println("my linked list: "+mll.toString());



        //Comparison of my linked list and java standard one
        mll.clear();
        Random random = new Random();


		LinkedList<Integer> javaLinkedList = new LinkedList<>();

		long start = System.nanoTime();
		for(int i=0;i<10000;i++){
			javaLinkedList.add(random.nextInt(10000));
		}
		long finish = System.nanoTime();
		System.out.println("Java list was filled in "+(finish-start)+" nanoseconds.");

		start = System.nanoTime();
		for(int i=0;i<10000;i++){
			mll.add(random.nextInt(10000));
		}
		finish = System.nanoTime();
		System.out.println("My list was filled in "+(finish-start)+" nanoseconds.");

        start = System.nanoTime();
        javaLinkedList.indexOf(11000);
        finish = System.nanoTime();
        System.out.println("Java list search went in "+(finish-start)+" nanoseconds.");

        start = System.nanoTime();
        mll.indexOf(11000);
        finish = System.nanoTime();
        System.out.println("My list search went in "+(finish-start)+" nanoseconds.");

        start = System.nanoTime();
        for(int i=0;i<10000;i++){
            javaLinkedList.remove(0);
        }
        finish = System.nanoTime();
        System.out.println("Java list was emptied in "+(finish-start)+" nanoseconds.");

        start = System.nanoTime();
        for(int i=0;i<10000;i++){
            mll.remove(0);
        }
        finish = System.nanoTime();
        System.out.println("My list was emptied in "+(finish-start)+" nanoseconds.");





    }

}
