package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Создание папок
        ArrayList<String> arrayFolders = new ArrayList<>();
        arrayFolders.add("D://00_java//All_My_Project//Games//src");
        arrayFolders.add("D://00_java//All_My_Project//Games//res");
        arrayFolders.add("D://00_java//All_My_Project//Games//savegames");
        arrayFolders.add("D://00_java//All_My_Project//Games//temp");
        arrayFolders.add("D://00_java//All_My_Project//Games//src//main");
        arrayFolders.add("D://00_java//All_My_Project//Games//src//test");
        arrayFolders.add("D://00_java//All_My_Project//Games//res//drawables");
        arrayFolders.add("D://00_java//All_My_Project//Games//res//vectors");
        arrayFolders.add("D://00_java//All_My_Project//Games//res//icons");
        arrayFolders.add("D://00_java//All_My_Project//Games//res//icons");
        for (String folder : arrayFolders
             ) {
            createFolder(folder);
        }

        //Создание файлов
        ArrayList<String> arrayFile = new ArrayList<>();
        arrayFile.add("D://00_java//All_My_Project//Games//src//main//Main.java");
        arrayFile.add("D://00_java//All_My_Project//Games//src//main//Utils.java");
        arrayFile.add("D://00_java//All_My_Project//Games//temp//Temp.txt");
        for (String file : arrayFile
             ) {
            createFile(file);
        }
    }

    public static void createFolder(String pathName) {
        File myDir = new File(pathName);
        if (myDir.mkdir()) {
            System.out.println("Каталог " + pathName + " создан");
            writeLogProgramm("Каталог " + pathName + " создан");
        } else {
            System.out.println("ОШИБКА СОЗДАНИЯ КАТАЛОГА " + pathName);
            writeLogProgramm("ОШИБКА СОЗДАНИЯ КАТАЛОГА " + pathName);
        }
    }

    public static void createFile(String fileName) {
        File myFileName = new File(fileName);
        // создадим новый файл
        try {
            if (myFileName.createNewFile() || myFileName.exists()) {
                System.out.println("Файл " + fileName + " создан");
                writeLogProgramm("Файл " + fileName + " создан");
            } else {
                System.out.println("ОШИБКА СОЗДАНИЯ ФАЙЛА " + fileName);
                writeLogProgramm("ОШИБКА СОЗДАНИЯ ФАЙЛА " + fileName);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeLogProgramm(String myTextLog) {
        File myLogFile = new File("D://00_java//All_My_Project//Games//temp//Temp.txt");
        try (FileWriter writer = new FileWriter(myLogFile, true)) {
            // запись всей строки
            writer.write(myTextLog);
            // запись по символам
            writer.append('\n');
            writer.append('!');
            // дозаписываем и очищаем буфер
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
