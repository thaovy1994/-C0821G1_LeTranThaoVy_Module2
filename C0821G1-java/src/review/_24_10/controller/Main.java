package review._24_10.controller;

import review._24_10.model.Candidates;
import review._24_10.service.ICandidateService;
import review._24_10.service.IReadWriteService;
import review._24_10.service.implement.CandidateService;
import review._24_10.service.implement.IOTestFileService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ICandidateService myCandidate = new CandidateService();
        List<Candidates> myList = new ArrayList<>();
        IReadWriteService myFile = new IOTestFileService();
        myFile.readFile("src\\review\\_24_10\\candidates.csv");
        int choices = 0;
        do {
            System.out.println("*** CANDIDATE MANAGEMENT SYSTEM ***");
            System.out.println("1.\tExperience");
            System.out.println("2.\tFresher");
            System.out.println("3.\tInternship");
            System.out.println("4.\tSearching");
            System.out.println("5.\tExit");
            System.out.print("Please choose option: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    myCandidate.addCandidates(myList, 0);
                    myFile.writeFile("src\\\\review\\\\_24_10\\\\candidates.csv", myList);
                    break;
                case 2:
                    myCandidate.addCandidates(myList,1);
                    myFile.writeFile("src\\\\review\\\\_24_10\\\\candidates.csv", myList);
                    break;
                case 3:
                    myCandidate.addCandidates(myList,2);
                    myFile.writeFile("src\\\\review\\\\_24_10\\\\candidates.csv",myList);
                    break;
                case 4:
                    myCandidate.searchCandidates(myList);
                    break;
                case 5:
                    System.exit(5);
            }
        }
        while (choices != 5);
    }
}
