package review._24_10.service.implement;

import review._24_10.model.Candidates;
import review._24_10.service.IReadWriteService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOTestFileService implements IReadWriteService {

    @Override
    public void writeFile(String path, List<Candidates> myList) {
        try {
            FileWriter fileWriter = new FileWriter("src\\review\\_24_10\\candidates.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(myList.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error IO");
        }
    }

    @Override
    public List<Candidates> readFile(String path) {
        List<Candidates> candidatesList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("src\\review\\_24_10\\candidates.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] candidate = line.split(",");
                Candidates candidates = new Candidates(candidate[0], candidate[1], candidate[2],
                        Integer.parseInt(candidate[3]),
                        candidate[4], candidate[5], candidate[6],
                        Integer.parseInt(candidate[7]));
                candidatesList.add(candidates);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is empty");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidatesList;
    }
}
