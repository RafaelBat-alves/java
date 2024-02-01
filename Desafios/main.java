package Desafios;

import Desafios.classes.Audio;
import Desafios.classes.Favorites;
import Desafios.classes.Music;
import Desafios.classes.Podcast;

public class main {
    public static void main(String[] args) {
        Music audio = new Music("Music",12,1,3,"DOIDO","ROBERTO CAR","FORRO");
        audio.Like();
        audio.Plays();
        Audio audio1 = new Audio("Audio",5,1,2,5);
        Podcast podcast = new Podcast("Podcast",1000,1,1,5,"MAMONAS","DIRETO DO CEU MAMONAS");

        Favorites.MyFavorites(audio);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        Favorites.MyFavorites(podcast);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        Favorites.MyFavorites(audio1);
    }
}
