package review._24_10.controller;

import review._24_10.model.Candidates;
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
            System.out.println("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                case 2:
                case 3:
                    int birthDate;
                    int phone;
                    byte expInYear;
                    String graduationRank;
                    do {
                        System.out.println("Please input Birth Date: ");
                        birthDate = Integer.parseInt(input.nextLine());
                    } while (birthDate < 1990 || birthDate > 2021);
                    do {
                        System.out.println("Please input Phone: ");
                        phone = Integer.parseInt(input.nextLine());
                    } while (phone < 10);
                    do {
                        System.out.println("Please input Year of Experience:  ");
                        expInYear = Byte.parseByte(input.nextLine());
                    } while (expInYear < 0 || expInYear > 100);
                    do {
                        System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
                        graduationRank = input.nextLine();
                    } while (graduationRank != "Excellence" || graduationRank != "Good" || graduationRank != "Fair" || graduationRank != "Poor");
                    break;
                case 4:
                case 5:
                    System.exit(5);
            }
        } while (choices != 5);
    }
}
