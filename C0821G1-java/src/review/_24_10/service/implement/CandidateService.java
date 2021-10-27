package review._24_10.service.implement;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;
import review._24_10.model.Fresher;
import review._24_10.service.ICandidateService;
import review._24_10.utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateService implements ICandidateService {
    public List<Candidates> myList;

    public CandidateService() {
        myList = new ArrayList<>();
    }

    public CandidateService(List<Candidates> myList) {
        this.myList = myList;
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void addCandidates() {
        System.out.println("Please input ID: ");
        String candidateId = input.nextLine();

        System.out.println("Please input FirstName: ");
        String firstName = input.nextLine();
        System.out.println("Please input LastName: ");
        String lastName = input.nextLine();

        System.out.println("Please input Birth Date: ");
        int birthDate = Validation.inputBirthDate();

        System.out.println("Please input address: ");
        String address = input.nextLine();

        System.out.println("Please input Phone: ");
        int phone = Validation.inputPhone();

        System.out.println("Please input email: ");
        String email = Validation.inputEmail();

        System.out.println("Please input candidateType: ");
        byte candidateType = Byte.parseByte(input.nextLine());

        Candidates candidate = new Candidates(candidateId, firstName, lastName,
                birthDate, address, phone, email, candidateType);
        System.out.print("Do you want to continue (Y/N): ");
        String confirm = input.nextLine();
        if (confirm.equals("Y")) {
            myList.add(new Candidates());
        } else {
            showCandidates();
        }
    }


//        //GRADUATION RANK
//        while (true) {
//            System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
//            String graduationRank = input.nextLine();
//            if (graduationRank.equals("Excellence") || graduationRank.equals("Good") || graduationRank.equals("Fair") || graduationRank.equals("Poor")) {
//                           return graduationRank;
//            } else {
//                System.out.println("input again");
//            }
//        }
//    }

    @Override
    public void addExperience(Experience experience) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkExprienceYear();
        System.out.print("Enter professional skill: ");
        String professionalSkill = input.nextLine();
        myList.add(experience);
        System.err.println("Create success.");
    }

    @Override
    public void addFresher(List<Candidates> myList,Candidates candidate) {
        System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
        String graduationRank = Validation.checkInputGraduationRank();
        myList.add(new Fresher());
        System.err.println("Create success.");
    }

    @Override
    public void addIntern(List<Candidates> myList,Candidates candidate) {

    }

    @Override
    public void showCandidates() {
        for (Candidates candidates : myList) {
            System.out.println("Candidates: " + candidates.toString());
        }
    }

    @Override
    public void searchCandidates() {
        showCandidates();
        System.out.print("Enter candidate name (First name or Last name): ");
        String name = input.nextLine();
        System.out.print("Enter type of candidate: ");
        int type = input.nextByte();
        for (Candidates candidate : myList) {
            if (candidate.getCandidateType() == type
                    && candidate.getFirstName().contains(name)
                    || candidate.getLastName().contains(name)) {
                System.out.println(candidate.toString());
            }
        }
    }
}



