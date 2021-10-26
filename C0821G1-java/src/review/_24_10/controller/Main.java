package review._24_10.controller;

import review._24_10.model.Experience;
import review._24_10.model.Fresher;
import review._24_10.model.Intern;
import review._24_10.service.CandidateService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CandidateService myCandidate = new CandidateService();
        int choices = 0;
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1.\tExperience");
        System.out.println("2.\tFresher");
        System.out.println("3.\tInternship");
        System.out.println("4.\tSearching");
        System.out.println("5.\tExit");
        do {
            System.out.print("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    myCandidate.addExperience(new Experience("1", "Aelbrecht ", "Stefan", 1994, "ABC", 1234567891, "123asd", 0, 23, "communication"));
                case 2:
                    myCandidate.addFresher(new Fresher());
                case 3:
                    myCandidate.addIntern(new Intern());
//                    Candidates candidates = new Candidates(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
//                    myCandidate.addCandidates((Experience) candidates);

                case 4:
//                    myCandidate.searchCandidates();

                case 5:
                    System.exit(5);
            }
        }
        while (choices != 5);
    }
}
