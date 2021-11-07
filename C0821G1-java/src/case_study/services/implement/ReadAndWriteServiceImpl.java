package case_study.services.implement;

import case_study.models.*;
import case_study.services.ReadAndWriteService;

import java.io.*;
import java.util.List;
import java.util.Map;

public class ReadAndWriteServiceImpl implements ReadAndWriteService {

    @Override
    public void writeFileMap(String path, Map<Facility, Integer> myMap) {
        try {
            FileWriter fileWriterHouse = new FileWriter(path, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriterHouse);

            for (Map.Entry<Facility, Integer> facility : myMap.entrySet()) {
                //viết properties thuộc key vào file csv
                bufferedWriter.write(facility.getKey().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error IO");
        }
    }

    @Override
    public void writeFileList(String path, List<Person> myList) {
        try {
            FileWriter fileWriter = new FileWriter(path, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //viết đối tượng person vào file csv
            for (Person person : myList) {
                bufferedWriter.write(person.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error IO");
        }
    }

    @Override
    public Map<Facility, Integer> readFileMap(String path, Map<Facility, Integer> myMap) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] array = line.split(",");
//                Facility villa = new Villa(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]),Integer.parseInt(array[3]),
//                        array[4],array[5],Double.parseDouble(array[6]),Integer.parseInt(array[7]));
                Facility room = new Room(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]),Integer.parseInt(array[3]),
                        array[4],array[5]);
//                Facility house = new House(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]),Integer.parseInt(array[3]),
//                        array[4],array[5],Integer.parseInt(array[6]));
//                myMap.put(villa,0);
                myMap.put(room,0);
//                myMap.put(house,0);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myMap;
    }

    @Override
    public List<Person> readFileList(String path, List<Person> myList) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
//                Person person = new Person(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], array[6]);
//                Person employee = new Employee(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], array[6],
//                        array[7], array[8],Double.parseDouble(array[9]));
                Person customer = new Customer(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], array[6],
                        array[7], array[8]);
//                myList.add(employee);
                myList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }
}
