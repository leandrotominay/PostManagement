package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import entities.*;

public class Main {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Post 1

        Post p1 = new Post(
                sdf.parse("01/09/2002 02:00:00"),
                "Dia do meu nascimento!",
                "Este foi o dia em que eu nasci!!", 127);
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        // Post 2

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Post p2 = new Post(sdf.parse("02/03/2020 16:57:34"),
                "Dia mais feliz da minha vida!",
                "Este foi o dia em que eu me tornei uma pessoa completa!", 535);

        Comment c3 = new Comment("Parabéns para o casal!");
        Comment c4 = new Comment("Lindos!!");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);


    }
}
