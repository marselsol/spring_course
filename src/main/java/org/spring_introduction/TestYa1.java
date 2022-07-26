package org.spring_introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestYa1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine();
            //save strings with two numbers
            list.add(s);
        }

        int sum = 0;
        for (String stringAiBi: list) {
            String [] array = stringAiBi.split(" ");
            double ai = Double.parseDouble(array[0]);
            double bi = Double.parseDouble(array[1]);
            sum += (ai*bi);
        }

        for (String stringAiBi: list) {
            String [] array = stringAiBi.split(" ");
            double ai = Double.parseDouble(array[0]);
            double bi = Double.parseDouble(array[1]);
            System.out.println(ai*bi/sum);
        }
    }
}