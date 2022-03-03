package inheritance;

abstract class Mob1 {
	abstract void setOs();
	void setOffers()
	{
		System.out.println("10% Offer");
	}
}
class AppleMobiles extends Mob1
{
	@Override
	void setOs() {
		System.out.println("os set as Apple");
	}
}
class SamsungMobiles extends Mob1
{
	@Override
	void setOs() {
		System.out.println("os set as Android");
	}
}
public class Mobile
{
	public static void main(String[] args) {
		Mobile m = new Mobile();
	}
}
