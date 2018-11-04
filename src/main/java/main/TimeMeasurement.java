package main;

public class TimeMeasurement {

    private long start;
    private long stop;

    public TimeMeasurement() {
        this.start = System.nanoTime();
    }

    public void setStart() {
        this.start = System.nanoTime();
    }

    public double getTimeInMS() {
        stop = System.nanoTime();
        return (stop - start) / 1000000;
    }

    public double getTimeInS() {
        stop = System.nanoTime();
        return (stop - start) / 1000000000;
    }

    public String getAformattedTime() {

        final long MSEC = 1000000000;
        final long USEC = 1000000;

        stop = System.nanoTime();
        long time = stop - start;
        double tmp = 0;
        String tmpStr = "";

//        if (time >= SEC) { //s
//            tmp = time/SEC;
//            tmpStr = tmpStr + " " + String.valueOf(tmp) + "[s]"+ " => ";
//        }
        if (time >= MSEC) { // ms
            tmp = time/MSEC;
            tmpStr = tmpStr + " " + String.valueOf(tmp) + "[ms]";
        }
        else if (time >= USEC) { //us
            tmp = time/USEC;
            tmpStr = tmpStr + " " + String.valueOf(tmp) + "[us]";
        }


        return tmpStr;
    }

}
