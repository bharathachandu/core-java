package com.xworkz.patientdetailsapp.kcgenral;

import com.xworkz.patientdetailsapp.hospital.Hospital;
import com.xworkz.patientdetailsapp.patient.Patient;

public class KcGeneral extends Hospital {
    public int speed=150;
    boolean isAmountPaid = true;

    @Override
    public boolean  addPatient(Patient patient){

        System.out.println("child class method started");
        boolean isAdded = false;
            if (isAmountPaid) {
                isAdded = super.addPatient(patient);

            } else System.out.println("dud kato firstu");
            System.out.println("child class method ended");
    return isAdded;
    }

           public  void  canteen(){
               System.out.println("we provide canteen facility");
                        }
}
