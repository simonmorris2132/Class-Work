package factory;

import java.util.Scanner;

public class SongMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Title of the song?");
        String songTitle = scanner.nextLine();

        System.out.println("Who is the Artist?");
        String songArtist = scanner.nextLine();

        System.out.println("What is the genre");
        String songGenre = scanner.nextLine();

        System.out.println("How long is the song in seconds?");
        int songSec = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        Song song = new Song(songTitle, songArtist, songGenre, songSec);
        System.out.println(song);
    }
}
