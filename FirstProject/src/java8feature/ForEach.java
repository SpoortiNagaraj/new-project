package java8feature;
import java.util.*;

public class ForEach {
	public static void main(String[] args) {
	List<String> obj=new ArrayList<String>();
    obj.add("Cricket");
    obj.add("Kabadi");
    obj.add("Football");
    obj.add("Tennis");

    obj.forEach( s-> System.out.println(s));
}
}