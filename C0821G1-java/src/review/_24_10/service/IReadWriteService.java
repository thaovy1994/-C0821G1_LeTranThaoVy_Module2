package review._24_10.service;

import review._24_10.model.Candidates;

import java.util.List;

public interface IReadWriteService {
    List<Candidates> readFile(String path);
    void writeFile(String path, List<Candidates> myList);
}
