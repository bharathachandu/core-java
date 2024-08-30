package com.xworkz.patientdetailsapp.hospital;


import com.xworkz.patientdetailsapp.patient.Patient;

public class Hospital {
    public int  speed = 90;
    public static String cityName;
   public Patient patient;

   public boolean  addPatient(Patient patient){
      System.out.println("parent class method started");
      boolean isAdded= false;
      if(patient.patientName != null){
          this.patient= patient;
          this.patient.getPatientDetails();
          isAdded=true;

      }else System.out.println("enter a valid name");
      System.out.println("parent class method ended");
    return isAdded;
    }
    public void   admission(Hospital hospital){
        System.out.println("Patient is admited in "+hospital.getClass().getSimpleName());
   }
}
