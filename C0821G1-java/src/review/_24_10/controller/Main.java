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

        int choices = 0;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1.\tExperience");
            System.out.println("2.\tFresher");
            System.out.println("3.\tInternship");
            System.out.println("4.\tSearching");
            System.out.println("5.\tExit");
            System.out.print("Please choose option: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    Candidates candidate = new Experience();
                    myCandidate.addExperience(candidate);
                    break;
                case 2:
                    Candidates candidate1 = new Experience();
                    myCandidate.addFresher(candidate1);
                    break;
                case 3:
                    Candidates candidate2 = new Experience();
                    myCandidate.addIntern(candidate2);
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
