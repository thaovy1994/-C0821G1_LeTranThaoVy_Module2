package review._24_10.service;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;

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

    public void addCandidates(Experience experience) {
        this.myList.add(experience);
    }

    public void showCandidates() {
        for (Candidates candidates : myList) {
            System.out.println("Candidates: " + candidates.toString());
        }
    }


    public void searchCandidates(ArrayList<Candidates> candidates) {
        System.out.print("Enter candidate name (First name or Last name): ");
        String nameSearch = input.nextLine();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = input.nextByte();
        for (Candidates candidate : candidates) {
            if (candidate.getCandidateType() == typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

}

