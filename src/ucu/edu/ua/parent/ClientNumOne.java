package ucu.edu.ua.parent;

import ucu.edu.ua.enums.NumberOfClimbs;
import ucu.edu.ua.enums.NumberOfDays;
import ucu.edu.ua.enums.TypeOfSkipass;
import ucu.edu.ua.parent.Skipass;
import ucu.edu.ua.SkipassSpec;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public class ClientNumOne extends Skipass {

    public ClientNumOne(long id, boolean blocked) {
        super(new SkipassSpec(NumberOfDays.FIVE, NumberOfClimbs.FIFTY, TypeOfSkipass.SEASON), id, blocked);
    }
}