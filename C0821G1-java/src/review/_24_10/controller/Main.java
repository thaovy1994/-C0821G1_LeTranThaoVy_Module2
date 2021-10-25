package review._24_10.controller;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;
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
                case 2:
                case 3:
                    int birthDate;
                    int phone;
                    byte expInYear;
                    String graduationRank;
                    int type = Integer.parseInt(input.nextLine());

                    //ID
                    System.out.println("Please input ID: ");
                    String candidateId = input.nextLine();

                    //FIRST + LASTNAME
                    System.out.println("Please input FirstName + LastName: ");
                    String firstName = input.nextLine();
                    String lastName = input.nextLine();

                    //DATE OF BIRTH
                    do {
                        System.out.println("Please input Birth Date: ");
                        birthDate = Integer.parseInt(input.nextLine());
                    } while (birthDate < 1990 || birthDate > 2021);

                    //ADDRESS
                    System.out.println("Please input address: ");
                    String address = input.nextLine();

                    //PHONE
                    do {
                        System.out.println("Please input Phone: ");
                        phone = Integer.parseInt(input.nextLine());
                    } while (phone < 10);

                    //EMAIL
                    System.out.println("Please input email: ");
                    String email = input.nextLine();

                    //CHECK CANDIDATES TYPE
                    System.out.println("Please input candidateType: ");
                    byte candidateType = Byte.parseByte(input.nextLine());
                    switch (type) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    System.out.println("Do you want to continue (Y/N)?");
//                    if ()

                        //EXPERIENCE YEARS
//                    do {
//                        System.out.println("Please input Year of Experience:  ");
//                        expInYear = Byte.parseByte(input.nextLine());
//                    } while (expInYear < 0 || expInYear > 100);

                        //GRADUATION RANK
//                    do {
//                        System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
//                        graduationRank = input.nextLine();
//                    } while (!graduationRank.equals("Excellence"));

                        Candidates candidates = new Candidates(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
                    myCandidate.addCandidates((Experience) candidates);

                case 4:
//                    myCandidate.searchCandidates();

                case 5:
                    System.exit(5);
            }
        } while (choices != 5);
    }
}
