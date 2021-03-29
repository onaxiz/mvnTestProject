package com.gd.internship.me;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.github.javafaker.Faker;
import com.gd.internship.me.AlgoTime;


public class DZ02 {


    public static void main(String[] args) {

        List<String> stringsAL = new ArrayList<>();
        List<String> stringsLL = new LinkedList<>();
        AlgoTime timer = new AlgoTime();
        long timeAL, timeLL;

        setValues(stringsAL);
        setValues(stringsLL);

        System.out.println(stringsAL);

        //ADDING

        //ArrayList
        timer.setStartTime();
        stringsAL.add("To the end");
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.add("To the end");
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);

        //ArrayList
        timer.setStartTime();
        stringsAL.add( 0, "To the head");
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.add(0, "To the head");
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);

//        //ArrayList
        timer.setStartTime();
        stringsAL.add( 450000, "To the middle");
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.add(450000, "To the middle");
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);

        // DELETING

        //ArrayList
        timer.setStartTime();
        stringsAL.remove("To the end");
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.remove("To the end");
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);

        //ArrayList
        timer.setStartTime();
        stringsAL.remove( 0);
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.remove(0);
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);

        //ArrayList
        timer.setStartTime();
        stringsAL.remove( 450000);
        timer.setEndTime();
        timeAL = timer.getTotalTime();

        //LinkedList
        timer.setStartTime();
        stringsLL.remove(450000);
        timer.setEndTime();
        timeLL = timer.getTotalTime();

        estimateLists(timeAL,timeLL);
    }

    // sorry, but 100k it's too long for my PC
    public static void setValues(List<String> someList){
        for (int i = 0; i < 900000; i++){
            Faker faker = new Faker();
            someList.add(faker.dune().character());
        }
    }

    public static void estimateLists(long timeAL, long timeLL){
        System.out.println("Time for ArrayList: " + timeAL);
        System.out.println("Time for LinkedList: " + timeAL);

        if (timeAL < timeLL){
            System.out.println("ArrayList - WON");
        } else {
            System.out.println("LinkedList - WON");
        }
        System.out.println("--------------------------------");
    }
}
