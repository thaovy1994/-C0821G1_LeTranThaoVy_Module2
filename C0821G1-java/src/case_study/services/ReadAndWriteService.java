package case_study.services;

import case_study.models.Facility;
import case_study.models.Person;

import java.util.List;
import java.util.Map;

public interface ReadAndWriteService {
    void writeFileMap(String path, Map<Facility, Integer> myMap);

    void writeFileList(String path, List<Person> myList);

    Map<Facility, Integer> readFileMap(String path, Map<Facility, Integer> myMap);

    List<Person> readFileList(String path, List<Person> myList);

}
