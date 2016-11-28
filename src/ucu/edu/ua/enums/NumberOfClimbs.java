package ucu.edu.ua.enums;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public enum NumberOfClimbs {
    TEN, TWENTY, FIFTY, HUNDRED;

    @Override
    public String toString(){
        switch (this){
            case TEN:
                return "Ten";
            case TWENTY:
                return "Twenty";
            case FIFTY:
                return "Fifty";
            case HUNDRED:
                return "Hundred";
            default:
                return "No number of climbs";
        }
    }
}