package _04_class_and_object_in_java.exercise;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
//        this.endTime = new Date();
        //System.out.println(this.startTime);
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {

        this.startTime = new Date();
    }

    public void stop() {

        this.endTime  = new Date();
    }

    public float getElapsedTime(){

        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        stopWatch.stop();

        //thuc hien thuat toan:
        double[] arr1 = new double[50000];
        for(int i= 0; i<50000; i++){
            arr1[i] = Math.random()*100 + 1;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.printf("Elapsed time: %.2f ms", stopWatch.getElapsedTime());
    }
}
