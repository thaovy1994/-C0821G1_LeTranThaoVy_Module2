package _16_io_text_file.exercise.read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Country> readCsv() {     //method List để chứa dữ liệu
        List<Country> countryList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("src\\_16_io_text_file\\exercise\\read_file_csv\\file.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Country country;
            //kiểm tra từng line xem có khác null ko
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);      //temp[] là chuỗi nên phải ép kiểu sang số
                countryList.add(country);      //tạo đối tượng country
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();   //chỉ cần close bộ nhớ tạm buffered
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList= readCsv();
        for(Country country: countryList){
            System.out.println(country);
        }
    }
}
