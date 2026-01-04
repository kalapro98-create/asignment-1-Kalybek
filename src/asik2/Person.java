package asik2;
public abstract class Person implements Payable, Comparable<Person>{
    private static int num1=1;
    private int id;
    private String name;
    private String surname;
    public Person(){
        this.id=num1++ ;
        this.name="";
        this.surname="";
    }
    public Person(String name,String sername){
        this.id=num1++ ;
        this.name=name;
        this.surname=sername;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurename(){
        return surname;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurename(String surename){
        this.surname=surename;
    }
    public String getPosition(){
        if(this instanceof Employee){
            return ((Employee)this).getPosition();
        }else{
            return "Student";
        }
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    @Override
    public int compareTo(Person other) {
        if(this.getPaymentAmount()>other.getPaymentAmount()){
            return 1;
        }
        else if(this.getPaymentAmount()<other.getPaymentAmount()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
