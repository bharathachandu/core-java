package com.xworkz.traineeapp.xworkzimpl;

import com.xworkz.traineeapp.trainee.Trainee;
import com.xworkz.traineeapp.xworkz.Xworkz;

public class XworkzImpl implements Xworkz {
    Trainee trainee[]={null,null,null};
    int index;

    @Override
    public boolean addTrainee(Trainee trainee) {
        boolean isAdded=true;
        if(trainee!=null)
        {
            this.trainee[index++]=trainee;
        }
        return isAdded;
    }

    @Override
    public void getTrainee() {

        for (Trainee trainee: trainee)
        {
            System.out.println(trainee);
        }

    }

//        @Override
//        public void updateTrainee(int newTraineeAge) {
//
//        }
//
//        @Override
//        public void deleteTrainee() {
//            this.trainee = null;
//        }
}
