package com.class13;

import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManagement {
    public void getFile(File fileSorce,String word){

    }
    public int countWord(File fileSource, String word) throws Exception { //class
        int count = 0;
        try {
            String content = this.readFile(fileSource);
            //Count
            Pattern pattern = Pattern.compile(word);
            Matcher match = pattern.matcher(content);

            while( match.find() ) {
                count++;
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    private String readFile(File fileSource) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(fileSource);
            int available = fis.available(); //length of file
            byte content[] = new byte[available];

            fis.read(content);

            //Close file
            fis.close();
            return ( new String(content) );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
