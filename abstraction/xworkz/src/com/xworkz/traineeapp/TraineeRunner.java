package com.xworkz.traineeapp;

import com.xworkz.traineeapp.trainee.Trainee;
import com.xworkz.traineeapp.xworkz.Xworkz;
import com.xworkz.traineeapp.xworkzimpl.XworkzImpl;

import java.util.Scanner;

public class TraineeRunner {
    public static void main(String[] args) {

        Xworkz xworkz = new XworkzImpl();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            Trainee trainee = new Trainee();
            System.out.println("enter the name");
            trainee.setTraineeName(scanner.next());
            System.out.println("enter the id");
            trainee.setTraineeId(scanner.nextInt());
            System.out.println("enter age");
            trainee.setTraineeAge(scanner.nextInt());

            xworkz.addTrainee(trainee);
        }
        xworkz.getTrainee();

        
//        xworkz.updateTrainee(96);
//        System.out.println();
//        xworkz.getTrainee();
//
//        xworkz.deleteTrainee();
//        System.out.println();
//        xworkz.getTrainee();
    }
}