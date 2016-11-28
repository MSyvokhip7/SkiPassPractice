package ucu.edu.ua;

import ucu.edu.ua.parent.Skipass;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public class SkipassProcess{
    private int defaultSize = 10;
    private int insertIndex = 0;
    private Skipass[] a = new Skipass[defaultSize];

    public void addClient(Skipass nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }
    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Skipass[] b = new Skipass[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }
}
