package houseUtility;


public enum LiftState {
    UP(1), DOWN(-1), FREE(0);

    private int value;

    LiftState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
