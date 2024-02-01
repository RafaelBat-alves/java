package Desafios.classes;

public class Music extends Audio{
    private String Album;
    private String Artist;
    private String Gender;
    public Music(String Title, double Duration, int TotalPlays, int Likes, int Classification) {
        super(Title, Duration, TotalPlays, Likes, Classification);
    }
    public Music(String Title, double Duration, int TotalPlays, int Likes,String album,String Artist,String Gender) {
        super(Title, Duration, TotalPlays, Likes);

        this.Album = album;
        this.Artist = Artist;
        this.Gender = Gender;
    }
    public String getAlbum(){
        return Album;
    }
    public void setAlbum(String Album){
        this.Album = Album;
    }
    public String getArtist(){
        return Artist;
    }
    public void setArtist(String Artist){
        this.Artist = Artist;
    }
    public String getGender(){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender = Gender;

    }


    @Override
    public int getClassification() {
        if(this.getLikes()>=1) {
            return 10;
        }else{
            return 0;

        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "Album='" + Album + '\'' +
                ", Artist='" + Artist + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
