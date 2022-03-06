package collections;
import java.util.HashSet;
import java.util.TreeSet;
public class HasSetExample 
{
	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("ttttt");
		h.add("pppp");
		h.add("ssssss");
		h.add("mmmm");
		
		h.remove("ssssss");
		System.out.println(h);
		TreeSet<String> t=new TreeSet<String>();
		t.add("qqqqqq");
		t.add("wwwwww");
		t.add("dddddd");
		t.add("gggggg");
		System.out.println(t);
	}

}
