package com.cdac.operations;


import com.cdac.interf.Array1D;
import java.util.Random;
import java.util.Scanner;

public class ArrayOperations implements Array1D {

    int array[] = new int[15];
    int lowerLimit = -5;
    int upperLimit = 10;

    public void populate() {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        }

    }

    public void display() {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public void countElements() {
        int x = 6, count = 0;
        Scanner sc = new Scanner(System.in);

        int occur[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            occur[array[i]]++;
        }
        
        for (int i = 0; i < array.length; i++) {
            if (occur[i] ==x) {
                System.out.println(x + " is occurs " + occur[i] + " times");
            }
        }

        

        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    count++;
                }
                System.out.println("Number of Occurrence of the Element:" + count);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getLocalizedMessage());
        }

    }

	public void Populate() {
		// TODO Auto-generated method stub
		
	}

}