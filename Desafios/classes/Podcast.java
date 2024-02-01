package Desafios.classes;

public class Podcast extends Audio {
    private String Presenter;
    private String Description;
    public Podcast(String Title, double Duration, int TotalPlays, int Likes, int Classification) {
        super(Title, Duration, TotalPlays, Likes, Classification);
    }
    public Podcast(String Title, double Duration, int TotalPlays, int Likes, int Classification,String Presenter,String Description) {
        super(Title, Duration, TotalPlays, Likes, Classification);
        this.Description = Description;
        this.Presenter =Presenter;
    }
    public String getPresenter(){
        return Presenter;
    }
    public void setPresenter(String Presenter){

        this.Presenter = Presenter;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescription(String Description){
        this.Description = Description;

    }

    @Override
    public String toString() {
        return "Podcast{" +
                "Presenter='" + Presenter + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
