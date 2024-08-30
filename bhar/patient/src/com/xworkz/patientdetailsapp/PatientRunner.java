package com.xworkz.patientdetailsapp;

import com.xworkz.patientdetailsapp.hospital.Apollo;
import com.xworkz.patientdetailsapp.hospital.AsterCmi;
import com.xworkz.patientdetailsapp.hospital.Hospital;
import com.xworkz.patientdetailsapp.kcgenral.KcGeneral;
import com.xworkz.patientdetailsapp.patient.Patient;

public class PatientRunner {

    public static void main(String[] args) {

        Patient patient=new Patient();
        patient.patientName="Bharat";
        patient.age=96;
        Hospital.cityName="bengaluru";

        //polymorphism
        Hospital hospital = new KcGeneral(); // up casting  ||  implicit

        hospital.addPatient(patient);//runTime polymorphism
        hospital.admission(hospital);


        KcGeneral kcGeneral=(KcGeneral) hospital;
        System.out.println("city :-"+KcGeneral.cityName);//down casting || explicit
        kcGeneral.canteen();
        Patient patient2=new Patient();
        patient2.patientName="champs";
        patient2.age=98;


        AsterCmi asterCmi = (AsterCmi) hospital;
        asterCmi.addPatient(patient2);
        System.out.println("city :-"+AsterCmi.cityName);
        asterCmi.canteen();

        Patient patient3=new Patient();
        patient3.patientName="agasthya";
        patient3.age=99;
        Apollo apollo = (Apollo) hospital;
        apollo.addPatient(patient3);
        System.out.println("city :-"+Apollo.cityName);
        apollo.canteen();





        System.out.println(hospital.speed);



    }
}
