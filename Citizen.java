package com.company;

public class Citizen {
    private String name ;
    private boolean eligible;
    private Voting vote ;

    public Citizen(String name , Voting vote) {
        this.name = name;
        this.vote = vote;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }
    public void voteFor(){
        if (eligible){
            vote.incrementAccent();
            eligible=true;
        }}
    public void voteAgainst() {
        if (eligible)
            vote.incrementRefuseCount();
        eligible=false;
    }

    public String getName() {
        return name;
    }
    public boolean isEligible(){
        return eligible;
    }


}
