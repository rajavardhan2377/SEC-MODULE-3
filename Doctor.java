class Doctor{
    void consultationFee(){
        System.out.println("General doctor fee");
    }
}
class Dentist extends Doctor{
    void consultationFee(){
        System.out.println("Dentist fee: 300");
    }
}
class Cardiologist extends Doctor{
    void consultationFee(){
        System.out.println("Cardiologist fee: 500");
    }
}
class Surgeon extends Doctor{
    void consultationFee(){
        System.out.println("Surgeon fee: 800");
    }
}
public class Test4{
    public static void main(String[]args){
        new Dentist().consultationFee();
        new Cardiologist().consultationFee();
        new Surgeon().consultationFee();
    }
}
