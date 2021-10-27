package review._24_10.service;

import review._24_10.model.Candidates;
import review._24_10.model.Experience;

import java.util.List;

public interface ICandidateService {
    void addCandidates();
    void addExperience(Experience experience);
    void addFresher(List<Candidates> myList,Candidates candidate);
    void addIntern(List<Candidates> myList,Candidates candidate);
    void showCandidates();
    void searchCandidates();
}
