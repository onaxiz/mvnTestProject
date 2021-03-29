package com.gd.internship.me;

public class AlgoTime {
    long startTime;
    long endTime;
    long totalTime;

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public void setTotalTime() {
        this.totalTime = endTime - startTime;
    }

    public long getTotalTime() {
        setTotalTime();
        return totalTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
}
