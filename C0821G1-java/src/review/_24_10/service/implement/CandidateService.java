package review._24_10.service.implement;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;
import review._24_10.model.Fresher;
import review._24_10.model.Intern;
import review._24_10.service.ICandidateService;
import review._24_10.service.IReadWriteService;
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

    private IReadWriteService iReadWriteService = new IOTestFileService();

//    public void write() {
//        myList = this.iReadWriteService.writeFile();
//    }

    @Override
    public void addCandidates(List<Candidates> myList, int type) {
        try {
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
            String phone = Validation.inputPhone();

            System.out.println("Please input email: ");
            String email = Validation.inputEmail();

            System.out.println("Please input candidateType: ");

            Candidates candidate = new Candidates(candidateId, firstName, lastName,
                    birthDate, address, phone, email, type);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addExperience(Candidates candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkExprienceYear();
        System.out.print("Enter professional skill: ");
        String professionalSkill = input.nextLine();
        myList.add(new Experience(candidate.getCandidateId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(),
                yearExperience, professionalSkill));
        System.out.print("Do you want to continue (Y/N): ");
        String confirm = input.nextLine();
        if (confirm.equals("Y")) {
            myList.add(new Experience());
            System.err.println("Create success.");
        } else {
            showCandidates();
        }
    }

    @Override
    public void addFresher(Candidates candidate) {
        System.out.println("Please enter date of graduation: ");
        String graduationDate = input.nextLine();
        System.out.println("Please choose Rank of Graduation (Excellence, Good, Fair, Poor): ");
        String graduationRank = Validation.checkInputGraduationRank();
        System.out.println("Please enter your university: ");
        String education = input.nextLine();
        myList.add(new Fresher(candidate.getCandidateId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(),
                graduationDate, graduationRank, education));
        System.out.print("Do you want to continue (Y/N): ");
        String confirm = input.nextLine();
        if (confirm.equals("Y")) {
            myList.add(new Fresher());
            System.err.println("Create success.");
            System.out.println("");
        } else {
            showCandidates();
        }
    }

    @Override
    public void addIntern(Candidates candidate) {
        System.out.println("Please enter your majors: ");
        String majors = input.nextLine();
        System.out.println("Please enter your semester: ");
        String semester = input.nextLine();
        System.out.println("Please enter your University's name: ");
        String universityName = input.nextLine();
        myList.add(new Intern(candidate.getCandidateId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType(),
                majors, semester, universityName));
        System.out.print("Do you want to continue (Y/N): ");
        String confirm = input.nextLine();
        if (confirm.equals("Y")) {
            myList.add(new Intern());
            System.err.println("Create success.");
        } else {
            showCandidates();
        }
    }


    @Override
    public void showCandidates() {
        System.out.println("---Product list---");
        for (Candidates candidates : myList) {
            if (candidates instanceof Experience) {
                System.out.println("Candidates: " + candidates.toString());
            } else if (candidates instanceof Fresher) {
                System.out.println("Candidates: " + candidates.toString());
            } else if (candidates instanceof Intern) {
                System.out.println("Candidates: ");
            }
        }
    }

    @Override
    public void searchCandidates() {
        System.out.print("Enter candidate name (First name or Last name): ");
        String name = input.nextLine();
        System.out.print("Enter type of candidate: ");
        int type = input.nextByte();
        for (Candidates candidate : myList) {
            if (candidate.getCandidateType() == type && candidate.getFirstName().contains(name)
                    || candidate.getLastName().contains(name)) {
                System.out.println(candidate.toString());
            }
        }
    }
}



