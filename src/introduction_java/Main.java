package introduction_java;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        /**
         * Generate student uuid
         * Insert student's name
         * Insert student's class
         * Insert student's score
         * ----
         * Display student's info as table
         */
        Date date = Date.from(Instant.now());
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2001,1,1);
        UUID uuid = UUID.randomUUID();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(date);
        //
        String pattern = "Welcome".toUpperCase();
        char letter = 'A';
        try{
            for(char i=0;i<'Z';i++){
                System.out.print(letter);
                letter++;
                Thread.sleep(500);
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
