package ucu.edu.ua.enums;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public enum  TypeOfSkipass {
    WORKINGDAYS, WEEKEND, SEASON;

    @Override
    public String toString() {
        switch (this) {
            case WORKINGDAYS:
                return "Pass on working days";
            case WEEKEND:
                return "Pass on weekend";
            case SEASON:
                return "Pass on season";
            default:
                return "No pass";
        }
    }
}
