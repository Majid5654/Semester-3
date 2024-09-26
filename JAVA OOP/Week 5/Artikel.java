public class Artikel extends Content {
    private String authors_identity;

    public Artikel (String nameContent,String typeContent,String authors_identity){
        super(nameContent,typeContent);
        this.authors_identity = authors_identity;
    }

    public String getauthors_identity(){
        return authors_identity;
    }

    public void setauthoridentity(String author_identity){
        this.authors_identity = author_identity;
    }
    public void infoArtikel(){
        System.out.println("Name : "+getnameContent());
        System.out.println("Type : "+gettypeContent());
        System.out.println("Authors : "+getauthors_identity());
    }
}
