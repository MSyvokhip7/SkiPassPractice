package ucu.edu.ua;

import ucu.edu.ua.enums.NumberOfClimbs;
import ucu.edu.ua.enums.NumberOfDays;
import ucu.edu.ua.enums.TypeOfSkipass;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public class SkipassSpec {
    private NumberOfClimbs numberOfClimbs;
    private NumberOfDays numberOfDays;
    private TypeOfSkipass type;

    public SkipassSpec(NumberOfDays numberOfDays, NumberOfClimbs numberOfClimbs, TypeOfSkipass type) {
        this.numberOfClimbs = numberOfClimbs;
        this.numberOfDays = numberOfDays;
        this.type = type;
    }

    public TypeOfSkipass getType() {
        return type;
    }

    public void setType(TypeOfSkipass type) {
        this.type = type;
    }

    public NumberOfClimbs getNumberOfClimbs() {
        return numberOfClimbs;
    }

    public void setNumberOfClimbs(NumberOfClimbs numberOfClimbs) {
        this.numberOfClimbs = numberOfClimbs;
    }

    public NumberOfDays getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(NumberOfDays numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return type + ", number of trips is " + numberOfClimbs + ", expiration date: " + numberOfDays + ".";
    }
}

