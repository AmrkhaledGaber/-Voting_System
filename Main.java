package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Voting vote1=new Voting("Presdintal Vote");
        Citizen c1=new Citizen(" Hussien",vote1);
        Citizen c2=new Citizen("Amr",vote1);
        Citizen c3=new Citizen("Ahmed ",vote1);
        Citizen c4 = new Citizen("marwa" , vote1);
        c1.setEligible(true);
        c2.setEligible(true);
        c3.setEligible(false);
        c4.setEligible(true);
        c1.voteFor();
        c2.voteFor();
        c3.voteAgainst();
        c4.voteAgainst();
        System.out.println ("Accept Count :"+vote1.getAcceptCount());
        System.out.println ("Refuse Count :"+vote1.getRefuseCount());
        boolean flag=vote1.CheckAcceptance();
        if (flag)
            JOptionPane.showMessageDialog(null, "Candidate Accepted!");
else
        JOptionPane.showMessageDialog(null, "Candidate Refused!");
    }
}
