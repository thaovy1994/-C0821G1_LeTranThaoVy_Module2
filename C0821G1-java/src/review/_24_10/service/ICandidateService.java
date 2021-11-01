package review._24_10.service;

import review._24_10.model.Candidates;

import java.util.List;

public interface ICandidateService {
    void addCandidates(List<Candidates> myList, int type);
    void addExperience(List<Candidates> myList,Candidates candidate);
    void addFresher(List<Candidates> myList,Candidates candidate);
    void addIntern(List<Candidates> myList,Candidates candidate);
    void showCandidates();
    void searchCandidates();
}
