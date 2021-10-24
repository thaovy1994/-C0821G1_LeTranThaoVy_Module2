package review._24_10.service;

import review._24_10.model.Candidates;
import java.util.ArrayList;


public class CandidateService {
    private ArrayList<Candidates> myList;

    public CandidateService() {}

    public CandidateService(ArrayList<Candidates> myList) {
        this.myList = myList;
    }

    public ArrayList<Candidates> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Candidates> myList) {
        this.myList = myList;
    }

    public void addCandidates(Candidates candidates){
        myList.add(candidates);
    }
}
