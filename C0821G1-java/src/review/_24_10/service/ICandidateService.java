package review._24_10.service;

import review._24_10.model.Candidates;

import java.util.List;

public interface ICandidateService {
    void addCandidates(List<Candidates> myList, int type);
    void addExperience(Candidates candidate);
    void addFresher(Candidates candidate);
    void addIntern(Candidates candidate);
    void showCandidates();
    void searchCandidates();
}
