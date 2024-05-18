package houseUtility;

import java.util.TreeSet;

/**
 * Object of class lift has own state, level where they are located and handling applications
 */
public class Lift {
    LiftState state;
    int level;

    TreeSet<Integer> upwardApplications;
    TreeSet<Integer> downwardApplications;


    public Lift() {
        state = LiftState.FREE;
        level = 1;
        upwardApplications = new TreeSet<>();
        downwardApplications = new TreeSet<>();
    }


    public boolean contains(int application) {
        return upwardApplications.contains(application) || downwardApplications.contains(application);
    }
}


