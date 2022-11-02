package com.company;

public class Voting {
    private int acceptCount, refuseCount;
    private String title;

    public Voting(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void incrementAccent() {
        acceptCount++;
    }

    public void incrementRefuseCount() {
        refuseCount++;
    }

    public boolean CheckAcceptance() {
if (acceptCount>refuseCount){
    return true;
}
else return false;
    }

    public int getAcceptCount() {
        return acceptCount;
    }

    public int getRefuseCount() {
        return refuseCount;
    }
}