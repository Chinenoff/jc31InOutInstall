package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        //src
        //Создадим объекты File для файлов и каталогов:
        File dirSrc = new File("D://00_java//All_My_Project//Games//src");
        // пробуем создать каталог
        if (dirSrc.mkdir())    sb.append("Каталог src создан ** ");

        //res
        File dirRes = new File("D://00_java//All_My_Project//Games//res");
        if (dirRes.mkdir())    sb.append("Каталог res создан ** ");

        //savegames
        File dirSavegames = new File("D://00_java//All_My_Project//Games//savegames");
        if (dirSavegames.mkdir())    sb.append("Каталог savegames создан ** ");

        //temp
        File dirTemp = new File("D://00_java//All_My_Project//Games//temp");
        if (dirTemp.mkdir())    sb.append("Каталог temp создан ** ");

        //main
        File dirMain = new File("D://00_java//All_My_Project//Games//src//main");
        if (dirMain.mkdir())    sb.append("Каталог main создан ** ");

        //test
        File dirTest = new File("D://00_java//All_My_Project//Games//src//test");
        if (dirTest.mkdir())    sb.append("Каталог test создан ** ");

        //Main.java
        // определяем объект для файла
        File myFileMain = new File("D://00_java//All_My_Project//Games//src//main//Main.java");
        // создадим новый файл
        try {if (myFileMain.createNewFile())
            sb.append("Файл Main.java создан ** ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Utils.java
        File myFileUtils = new File("D://00_java//All_My_Project//Games//src//main//Utils.java");
        try {if (myFileUtils.createNewFile())
            sb.append("Файл Utils.java создан ** ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //drawables
        File dirDrawables = new File("D://00_java//All_My_Project//Games//res//drawables");
        if (dirDrawables.mkdir())    sb.append("Каталог drawables создан ** ");

        //vectors
        File dirVectors = new File("D://00_java//All_My_Project//Games//res//vectors");
        if (dirVectors.mkdir())    sb.append("Каталог vectors создан ** ");

        //icons
        File dirIcons = new File("D://00_java//All_My_Project//Games//res//icons");
        if (dirIcons.mkdir())    sb.append("Каталог icons создан ** ");

        //temp.txt
        File myFileTemp = new File("D://00_java//All_My_Project//Games//temp//Temp.txt");
        try {if (myFileTemp.createNewFile())
            sb.append("Файл temp.txt создан ** ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(sb);

        String logText = sb.toString();
        try (FileWriter writer = new FileWriter(myFileTemp, false)) {
            // запись всей строки
            writer.write(logText);
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
