package inheritance;

abstract class Delhi
{
abstract void idVerification();//abstract method
void finalApproval()//
{
System.out.println("Approved by Head office Delhi");
}
}



class Bangalore extends Delhi
{
@Override
void idVerification() {
System.out.println("Verifying photo id using Ration card");
}
}



class Chennai extends Delhi
{
@Override
void idVerification() {
System.out.println("Verifying photo id using Driving liscence");
}

}




public class Passport {
public static void main(String[] args) {

Delhi m = new Bangalore();
m.idVerification();
m.finalApproval();


System.out.println("-------------");

m = new Chennai();
m.idVerification();
m.finalApproval();
}



}