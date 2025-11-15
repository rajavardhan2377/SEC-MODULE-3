class Employee{
    String name;
    double salary;
    void displayInfo(){
        System.out.println("Name:"+name+", Salary:"+salary);
    }
}
class Manager extends Employee{
    String department;
    void displayInfo(){
        System.out.println("Name:"+name+", Salary:"+salary+", Department:"+department);
    }
}
public class Test1{
    public static void main(String[]args){
        Manager m=new Manager();
        m.name="Rahul";
        m.salary=50000;
        m.department="HR";
        m.displayInfo();
    }
}
