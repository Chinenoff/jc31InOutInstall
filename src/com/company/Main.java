package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Создание папок
        //src
        createFolder("D://00_java//All_My_Project//Games//src");

        //res
        createFolder("D://00_java//All_My_Project//Games//res");

        //savegames
        createFolder("D://00_java//All_My_Project//Games//savegames");

        //temp
        createFolder("D://00_java//All_My_Project//Games//temp");

        //main
        createFolder("D://00_java//All_My_Project//Games//src//main");

        //test
        createFolder("D://00_java//All_My_Project//Games//src//test");

        //drawables
        createFolder("D://00_java//All_My_Project//Games//res//drawables");

        //vectors
        createFolder("D://00_java//All_My_Project//Games//res//vectors");

        //icons
        createFolder("D://00_java//All_My_Project//Games//res//icons");


        //Создание файлов
        //Main.java
        createFile("D://00_java//All_My_Project//Games//src//main//Main.java");

        //Utils.java
        createFile("D://00_java//All_My_Project//Games//src//main//Utils.java");

        //temp.txt
        createFile("D://00_java//All_My_Project//Games//temp//Temp.txt");
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
