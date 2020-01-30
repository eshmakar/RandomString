package com.marat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) throws IOException {
            long start = System.currentTimeMillis();
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 100;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);

            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }

            String generatedString = buffer.toString();

            FileWriter fileWriter = new FileWriter("D:\\generation\\slova\\123456789.txt", true);
            System.out.println("Начинаю....");
            fileWriter.write(generatedString);
            fileWriter.close();
            long stop = System.currentTimeMillis();
            System.out.println("Выполнено за "+ (double)(stop-start)/1000  + " секунды");
            System.out.println();
        }

    }