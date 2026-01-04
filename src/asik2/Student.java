package asik2;
public class Student extends Person{
    private static final double STIPEND=36660.00;
    private double GPA;
    public Student(){
        super();
        this.GPA=0.0;
    }
    public Student(String name,String surname,double GPA){
        super(name,surname);
        this.GPA=GPA;
    }
    public double getGPA(){
        return this.GPA;
    }
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
    @Override
    public double getPaymentAmount(){
        if(GPA>2.67){
         return STIPEND;
        }
        else{
            return 0.0;
        }
    }
    @Override
    public String toString(){
        return "student: "+super.toString();
    }
    @Override
    public int compareTo(Person other){
        if (this.getPaymentAmount()>other.getPaymentAmount()){
            return 1;
        } else if (this.getPaymentAmount()<other.getPaymentAmount()){
            return -1;
        } else {
            return 0;
        }
    }
}

