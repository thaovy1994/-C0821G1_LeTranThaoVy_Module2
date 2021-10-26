package review._24_10.service;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;
import review._24_10.model.Fresher;
import review._24_10.model.Intern;

import java.util.ArrayList;
import java.util.Scanner;

public class CandidateService {
    private static Scanner input;

    public static void setInput(Scanner input) {
        CandidateService.input = input;
    }

    private ArrayList<Candidates> myList;

    public CandidateService() {
    }

    public CandidateService(ArrayList<Candidates> myList) {
        this.myList = myList;
    }

    public ArrayList<Candidates> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Candidates> myList) {
        this.myList = myList;
    }

    public void addCandidates(ArrayList<Candidates> myList, int type) {
        int birthDate;
        int phone;
        byte expInYear;

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

        //EXPERIENCE YEARS
        do {
            System.out.println("Please input Year of Experience:  ");
            expInYear = Byte.parseByte(input.nextLine());
        } while (expInYear < 0 || expInYear > 100);

        //GRADUATION RANK
        while (true) {
            System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
            String graduationRank = input.nextLine();
            if (graduationRank.equals("Excellence") || graduationRank.equals("Good") || graduationRank.equals("Fair") || graduationRank.equals("Poor")) {
//                            return graduationRank;
            } else {
                System.out.println("input again");
            }
        }
    }

    public void addExperience(Experience experience) {
        this.myList.add(experience);
    }
    public void addFresher(Fresher fresher) {
        this.myList.add(fresher);
    }
    public void addIntern(Intern intern) {
        this.myList.add(intern);
    }

//    public void showCandidates() {
//        for (Candidates candidates : myList) {
//            System.out.println("Candidates: " + candidates.toString());
//        }
//    }

    public void searchCandidates(ArrayList<Candidates> candidates) {
        System.out.print("Enter candidate name (First name or Last name): ");
        String nameSearch = input.nextLine();
        System.out.print("Enter type of candidate: ");
        int candidateType = input.nextByte();
        for (Candidates candidate : candidates) {
            if (candidate.getCandidateType() == candidateType
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

}

