package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Balkezes> list;

    public static void main(String[] args) {
	    Feladatok feladatok = new Feladatok();
        loadData();
        list = new ArrayList<Balkezes>();
    }

    public static ArrayList<Balkezes> getList()
    {
        return list;
    }

    public static void loadData() {
        String fileToParse = "Balkezesek.csv";
        BufferedReader fileReader = null;

        final String DELIMITER = ",";
        try
        {
            String line = "";
            fileReader = new BufferedReader(new FileReader(fileToParse));
            fileReader.readLine();

            while ((line = fileReader.readLine()) != null)
            {
                String[] tokens = line.split(DELIMITER);
                for(String token : tokens)
                {
                    String[] parts = line.split(";");
                    //System.out.println(parts[0]);
                    list.add(new Balkezes(parts[0], LocalDate.parse(parts[1]),LocalDate.parse(parts[2]),Integer.parseInt(parts[3]),Integer.parseInt(parts[4])));
                }
            }
            System.out.println(list.size());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
