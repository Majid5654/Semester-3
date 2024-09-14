public class Member {
    private  String name;
    private String addres;
    private float deposit;


    Member(String name,String addres){
        this.name=name;
        this.addres=addres;
    }

    public void setname(String name){
        this.name=name;
    }

    public void setAddres(String address){
        this.addres=address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return addres;
    }

    public float getDeposit(){
        return deposit;
    }

    public void deposit (float money){
        deposit += money;
    }
    public void loan (float money){
        deposit-=money;
    }
}
