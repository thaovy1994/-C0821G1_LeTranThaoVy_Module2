package _16_io_text_file.exercise.copy_file_text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    public static final String PATH_SOURCE_FILE = "src\\_16_io_text_file\\exercise\\copy_file_text\\sourceFile.txt";
    //    String sourceFile = PATH_SOURCE_FILE;
    public static final String PATH_TARGET_FILE = "src\\_16_io_text_file\\exercise\\copy_file_text\\targetFile.txt";

    //ĐỂ COPY ĐƯỢC THÌ:
    //Bước 1: Đọc được sourcefile
    public static String readFile(FileReader fileReader) throws IOException {     //đọc file bằng class FileReader
        //hàm read() sẽ đọc từng kí tự + trả về kiểu int...
        //Khai báo biến đếm i
        int i;
        //kết quả đọc được là kiểu String
        String result = "";
        while ((i = fileReader.read()) != -1) {   //vẫn còn dữ liệu để đọc
            result += (char) i;
        }
        fileReader.close();
        return result;
    }

    //Ghi nội dung đã đọc vào targetFile
    public static void writeFile(FileWriter fileWriter, String content){
        try {
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Write success !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            String result = readFile(new FileReader(PATH_SOURCE_FILE));
            System.out.println(result);
            writeFile(new FileWriter(PATH_TARGET_FILE),result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
