import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {
        //collect input about weather
        System.out.println("What is the weather like today?");
        Scanner reader = new Scanner(System.in);
        String currentWeather = reader.nextLine();
        //collect input about temperature
        System.out.println("What is the temperature right now?");
        Scanner reader2 = new Scanner(System.in);
        int currentTemperature = reader2.nextInt();

        if ((currentWeather.equals("Sunny") && (currentTemperature >= 20)))
        {
            System.out.println("wear suncream and thinner, cooler clothes");
        } else if ((currentWeather.equals("Sunny")  && (currentTemperature <= 12))) {
            System.out.println("wear suncream and warm clothes");
        }
        else if (currentWeather.equals("Sunny")){
            System.out.println("wear suncream and any regular clothes");
        }

        else if ((currentWeather.equals("Cloudy") && (currentTemperature >= 20))) {
            System.out.println("wear thinner, cooler clothes");
        }
        else if ((currentWeather.equals("Cloudy") && (currentTemperature <= 12))) {
            System.out.println("wear thicker, warmer clothes");
        }
        else if (currentWeather.equals("Cloudy")) {
            System.out.println("wear regular clothes");
        }

        else if ((currentWeather.equals("Rainy") && (currentTemperature >= 20))) {
            System.out.println("wear thinner, waterproof clothes");
        }
        else if ((currentWeather.equals("Rainy") && (currentTemperature <= 12 ))) {
            System.out.println("wear thicker, warmer, waterproof clothes");
        }
        else if (currentWeather.equals("Rainy")) {
            System.out.println("wear waterproof clothes");
        }
        else {
            System.out.println("wear thick, warm, waterproof clothes and snow-boots");
        }
    }
}
