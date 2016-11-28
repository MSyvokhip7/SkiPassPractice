package ucu.edu.ua.enums;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public enum NumberOfDays {
    ONE, TWO, FIVE;

    @Override
    public String toString() {
        switch (this) {
            case ONE:
                return "One day";
            case TWO:
                return "Two days";
            case FIVE:
                return "Five days";
            default:
                return "No days";
        }
    }
}
