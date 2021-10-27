package review._24_10.controller;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;
import review._24_10.service.ICandidateService;
import review._24_10.service.implement.CandidateService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ICandidateService myCandidate = new CandidateService();

        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1.\tExperience");
        System.out.println("2.\tFresher");
        System.out.println("3.\tInternship");
        System.out.println("4.\tSearching");
        System.out.println("5.\tExit");
        int choices = 0;
        do {
            System.out.print("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
//                    myCandidate.addExperience();
                    myCandidate.showCandidates();
                    break;
                case 2:
//                    myCandidate.addFresher();
                    myCandidate.showCandidates();
                    break;
                case 3:
//                    myCandidate.addIntern();
                    myCandidate.showCandidates();
                    break;
                case 4:
                    myCandidate.searchCandidates();
                    break;
                case 5:
                    System.exit(5);
            }
        }
        while (choices != 5);
    }
}
