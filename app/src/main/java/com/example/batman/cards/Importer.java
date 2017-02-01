package com.example.batman.cards;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This class represents the Import-Module which gets all the Vocables from the file
 * assets\vocables\vocables.txt
 */

public class Importer {

    //private String file_name = "C:\\Users\\Batman\\AndroidStudioProjects\\Cards\\app\\src\\main\\assets\\vocables\\vocables.txt";
    private String file_name = "C:/Users/Batman/AndroidStudioProjects/Cards/app/src/main/assets/vocables/vocables.txt";

    public Importer() {
    }

    public ArrayList<Chapter> import_vocables(BufferedReader input) {
        ArrayList<Chapter> chapters = new ArrayList<>();
        try {
            String line = "";
            Chapter current_chap = new Chapter(0);
            Vocable current_vocable = new Vocable("", "", "");
            while ((line = input.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    current_chap = new Chapter(Integer.parseInt(parts[1]));
                    chapters.add(current_chap);
                    System.out.println(parts[0] + ";" + parts[1]);
                } else if (parts.length == 3) {
                    current_vocable = new Vocable(parts[2], parts[1], parts[0]);
                    current_chap.add_vocable(current_vocable);
                    System.out.println(parts[0] + ";" + parts[1] + ";" + parts[2]);
                } else {
                    // if line does not match pattern, do nothing with it
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chapters;
    }
}
