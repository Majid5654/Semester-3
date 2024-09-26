public class Content {
    private String nameContent;
    private String typeContent;

    public Content(String nameContent,String typeContent){
        this.nameContent = nameContent;
        this.typeContent = typeContent;
    }

    public String getnameContent(){
        return nameContent;
    }

    public void setnameContent(String nameContent){
        this.nameContent = nameContent;
    }

    public String gettypeContent(){
        return typeContent;
    }

    public void settypeContent(String typeContent){
        this.typeContent = typeContent;
    }


}
