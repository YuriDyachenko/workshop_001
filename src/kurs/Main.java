package kurs;

import java.util.Calendar;

//В каждом языке программирования есть способ получить текущее время.
//Предлагаю написать программу, которая приветствует Вас следующим образом:
//C 00 часов до 04 часов включительно программа при запуске пишет - "Доброй ночи, {username}"
//С 05 часов до 09 часов включительно программа при запуске пишет - "Доброе утро, {username}"
//С 10 часов до 16 часов включительно программа при запуске пишет - "Добрый день, {username}"
//С 17 часов до 23 часов включительно программа при запуске пишет - "Добрый вечер, {username}"
//Само собой, {username} должен заменяться на Ваше имя.

public class Main {

    public static void main(String[] args) {

        String userName = "Юрий";
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        String hello = hour > 17 ? "Добрый вечер" : hour > 10 ? "Добрый день" :
                hour > 5 ? "Доброе утро" : "Доброй ночи";
        System.out.printf("%s, %s!\n", hello, userName);

    }
}
