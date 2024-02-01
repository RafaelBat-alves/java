package Desafios.classes;

public interface Favorites {

    public static void MyFavorites(Audio a){
        System.out.println("Title='" + a.getTitle() + '\'' +
                ", Duration=" + a.getDuration() +
                ", TotalPlays=" + a.getTotalPlays() +
                ", Likes=" + a.getLikes() +
                ", Classification=" + a.getClassification() +
                '}');
        if(a instanceof Music){
            Music music = (Music) a;
            System.out.println( "Album='" + music.getAlbum() + '\'' +
                    ", Artist='" + music.getArtist() + '\'' +
                    ", Gender='" + music.getGender() + '\'' );

        }
        if(a instanceof Podcast){
            Podcast p = (Podcast) a;
            System.out.println(   "Presenter='" + p.getPresenter() + '\'' +
                    ", Description='" + p.getDescription() + '\'' );

        }


    }
}
