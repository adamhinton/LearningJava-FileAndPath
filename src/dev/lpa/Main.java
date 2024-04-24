package dev.lpa;

import java.io.File;

public class Main {
    public static void main(String[] args) {



    }

    private static void useFile(String fileName){

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File '%s' %s%n", fileName, fileExists ? "exists." : "does not exist.");

        if(fileExists){
            System.out.println("Deleting file: " + fileName);
            fileExists = !file.delete();
        }

        if(!fileExists){
            // Ignoring this for simplicity, but it could return an unresolved error
            file.createNewFile();
        }
    }
}