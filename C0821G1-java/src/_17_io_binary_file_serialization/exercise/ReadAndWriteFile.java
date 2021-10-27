package _17_io_binary_file_serialization.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> productList = new ArrayList<>();
        try {
            FileOutputStream fos = new FileOutputStream("src\\_17_io_binary_file_serialization\\exercise\\file.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;

    }
}
