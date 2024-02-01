package Desafios.classes;

public class Audio {
    private String Title;
    private double Duration;
    private int TotalPlays;
    private int Likes;
    private int Classification;

    public Audio(String Title,double Duration,int TotalPlays,int Likes,int Classification){
        this.Title = Title;
        this.Duration = Duration;
        this.TotalPlays = TotalPlays;
        this.Likes= Likes;
        this.Classification = Classification;


    }
    public Audio(String Title,double Duration,int TotalPlays,int Likes){
        this.Title = Title;
        this.Duration = Duration;
        this.TotalPlays = TotalPlays;
        this.Likes= Likes;
        this.Classification = Classification;


    }
    public void Plays(){
        this.TotalPlays++;

    }
    public void Like(){
        this.Likes++;

    }
    public String getTitle(){

        return Title;
    }
    public void setTitle(String title){

        this.Title = title;

    }
    public double getDuration(){

        return Duration;
    }
    public void setDuration(double duration){
        this.Duration = duration;

    }
    public int getTotalPlays(){
        return TotalPlays;

    }
    public void setTotalPlays(int totalPlays){
        this.TotalPlays = totalPlays;
    }
    public int getLikes(){
        return Likes;

    }
    public void setLikes(int likes ){
        this.Likes = likes;
    }
    public int getClassification(){

        return Classification;
    }



    @Override
    public String toString() {
        return "Audio{" +
                "Title='" + Title + '\'' +
                ", Duration=" + Duration +
                ", TotalPlays=" + TotalPlays +
                ", Likes=" + Likes +
                ", Classification=" + Classification +
                '}';
    }
}
