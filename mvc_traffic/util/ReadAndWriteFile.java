package mvc_traffic.util;


import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ReadAndWriteFile {
    //    Ghi file
    public static void writeListStringToCSV(String filePath, List<String> list, boolean append) throws IOException {
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file, append);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String line : list) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();

    }

    //    Đọc file
    public static List<String> readListStringFromCSV(String filePath) throws IOException {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }
        bufferedReader.close();
        fileReader.close();
        return stringList;
    }
}
