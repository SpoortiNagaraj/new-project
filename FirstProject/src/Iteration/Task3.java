package Iteration;
import java.util.*;

class Task3 {
	static void removeDuplicate(char str[],int n)
	{
		HashSet<Character> s= new LinkedHashSet<>(n-1);
		for(Character x: str)
			s.add(x);
		for(Character x: s)
			System.out.println(x);
	}
	public static void main(String[] args) {
		char str[]="malayalam".toCharArray();
		int n=str.length;
		removeDuplicate(str,n);
	}

}

public class Tasks {
    int task1(int nums[])
    {
        int sum=0;
        Set<Integer> n=new HashSet<Integer>();
        for(int k : nums)
                n.add(k);
        Iterator<Integer> itr=n.iterator();
        while(itr.hasNext())
            sum=sum+itr.next();

        return sum;
        //WAP to accept an array of integers,
        //remove the duplicates and find the sum and return
    }
    String task2(String input)
    {
        //StringBuffer result=new StringBuffer();
        String result="";
        Set<Character> s=new TreeSet<Character>();
        for(char c : input.toCharArray())
        {
            s.add(c);
        }
        System.out.println(s);
        Iterator<Character> itr=s.iterator();
        while(itr.hasNext())
            result=result+itr.next();
            //result.append(itr.next());

        return result;
        //return result.toString();
        //WAP to get a string ,remove the duplicate characters ,sort the letters
        //in ascending and return as a string
        // sample :  malayalam         - > almy
    }
    String task3(String input)
    {
        StringBuffer result=new StringBuffer();
        List<Character> lst=new ArrayList<Character>();
        for(char ch : input.toCharArray())
        {
            if(!(lst.contains(ch)))
                lst.add(ch);
        }
        for(char ch : lst)
                result.append(ch);
        //System.out.println(lst);
    //    String result="";
    /*    Set<Character> s=new LinkedHashSet<Character>();
        for(char c : input.toCharArray())
        {
            s.add(c);
        }
        System.out.println(s);
        Iterator<Character> itr=s.iterator();
        while(itr.hasNext())
            result.append(itr.next());
        */
        return result.toString();

        //WAP to accept a String, remove the duplicate characters,and return the
        //string  , sample :  malayalam         - > maly
    }
    public static void main(String[] args)
    {
        int input[]= {1,2,3,1,3,4,9,1,2,4,1,3,6};
        Tasks obj=new Tasks();
        System.out.println(obj.task1(input));
        System.out.println(obj.task2("malayalam"));
        System.out.println(obj.task3("maly"));

    }
}
