package houseUtility;

import java.util.TreeSet;

public class Applications {
    public TreeSet<Integer> upwardApplications;
    public TreeSet<Integer> downwardApplications;

    Applications() {
        upwardApplications = new TreeSet<>();
        downwardApplications = new TreeSet<>();
    }

    /**
     * @param application
     * @return is contained passed application in unhandled upward or downward applications
     */
    boolean contains(int application) {
        return upwardApplications.contains(application) || downwardApplications.contains(application);
    }


    boolean isEmpty() {
        return upwardApplications.isEmpty() || downwardApplications.isEmpty();
    }
}
