package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7(999) 999-99-99";
        post.passport = "7288 № 888888";
        post.subscribtion = true;
        post.birthday = new FormDate();
        post.birthday.Day = 13;
        post.birthday.Mounth = 6;
        post.birthday.Year = 1999;
    }
}