public class Video extends Content {
    private int resolution;
    private String duration;

    public Video(int resolution,String duration,String nameContent,String typeContent){
        super(nameContent, typeContent);
        this.resolution = resolution;
        this.duration = duration;
    }

    public int getresolution(){
        return resolution;
    }

    public void setresolution(int resolution){
        this.resolution = resolution;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public void infoVideo(){
        System.out.println("Name content : " +getnameContent());
        System.out.println("type content : " +gettypeContent());
        System.out.println("Duration : " +getDuration());
        System.out.println("Resolution : " +getresolution());
    }


    
}
