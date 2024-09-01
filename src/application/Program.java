package application;

import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // Define o formato para data e hora
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Cria e configura o primeiro post
        Post post01 = new Post();
        post01.setMoment(LocalDateTime.parse("21/06/2018 13:05:44",dateTimeFormatter));
        post01.setTitle("Traveling to New Zealand");
        post01.setContent("I'm going to visit this wonderful country!");
        post01.setLikes(12);
        post01.addComment("Have a nice trip");
        post01.addComment("Wow a nice trip");

        // Cria e configura o segundo post
        Post post02 = new Post();
        post02.setMoment(LocalDateTime.parse("28/07/2018 23:14:19", dateTimeFormatter));
        post02.setTitle("Good night guys!");
        post02.setContent("See you tomorrow");
        post02.setLikes(5);
        post02.addComment("Good night");
        post02.addComment("Have a nice night!");
        post02.addComment("May the Force be with you");

        // Imprime os posts
        System.out.println("\n" + post01);
        System.out.println("\n" + post02);

    }
}