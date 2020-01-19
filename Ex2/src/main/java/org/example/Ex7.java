package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (String list : lines) {
                System.out.println(list);
            }
            int size = lines.size();
            if (size>0){
                writeInFile(size);
            }
            else{
                System.out.println("Файл пуст");
            }
        }
        else {
            System.out.println("Файла не существует");
        }
    }
    public static void writeInFile(int size){
        try(FileWriter writer = new FileWriter("text.txt")) {
            Scanner scanner = new Scanner(System.in);
            String text;
            System.out.println("Введи "+size+" строк(-и)");
          for(int i=0;i<size;i++){
              text=scanner.nextLine();
              writer.write(text);
              writer.append('\n');
          }
        }
          catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
