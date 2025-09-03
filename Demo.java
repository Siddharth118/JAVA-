package package1;
import java.util.*;

public class Demo 
{
  public static void main(String[] args) 
  {
	 int a=5;
	 //System.out.println();	 
	 Demo obj = new Demo();
	 int b = obj.meth1(5);
	 //System.out.println(b);
	 
	 int[] arr = new int[3];
	 arr[0] = 1;
	 arr[1] = 2;
	 arr[2] = 1;
	 
	for(int x:arr)
	{
		//System.out.println(x);
	}
	 
	 int[] arr1 = {1,2,3,4,5};
	 
	// System.out.println(arr1);
	 for(int x:arr1)
		{
			//System.out.print("["+x+"]");
		}
	 
	//System.out.println(arr1.length);
	 
	 //LIST
	
//   Vector<Integer>  vec	=  new Vector<>();
//	
//	 vec.add(1);
//	 vec.add(2);
//	 vec.add(3);
//	 vec.add(4);
//	 vec.add(5);
//	 vec.add(6);
//	 vec.add(7);
//	 vec.add(8);
//	 vec.add(9);
//	 vec.add(10);
//	 vec.add(11);
//	 
//	 System.out.println(vec);
//	 
//	 ArrayList<String> arr2 = new ArrayList<>();
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 arr2.add("A");
//	 System.out.println(arr2);
//	 
//	 Stack<Character> st = new Stack<>();
//	 st.add('a');
//	 st.add('@');
//	 System.out.println(st);
//	 
//	 LinkedList<Character> ll = new LinkedList<>();
//	 

	 
	 HashSet<Integer> set = new HashSet<>();
	 set.add(10);
	 set.add(2);
	 set.add(30);
	 set.add(4);
	 set.add(-5);
	 set.add(6);
	// System.out.println(set);
	 
	 LinkedHashSet<Integer> ll = new LinkedHashSet<>();
	 ll.add(10);
	 ll.add(2);
	 ll.add(30);
	 ll.add(4);
	 ll.add(-5);
	 ll.add(6);
	 ll.add(6);
	// System.out.println(ll);
	 
	 TreeSet<Integer> ts = new TreeSet<>();
	 ts.add(3);
	 ts.add(2);
	 ts.add(1);
	 //System.out.println(ts);
	 
	 Map<String, String> map = new LinkedHashMap<>();
	 map.put("A", "Shashank");
	 map.put("G", "Harsha");
	 map.put("q", "Siddu");
	 map.put("w", "Laksmi");
	 
	 //System.out.println(map.getOrDefault(map, 1));
	 System.out.println(map);
	 
	 Map<Character, Integer> m = new TreeMap<>();
	 m.put('A', 1);  //65
	 m.put('B', 0);   //66
	 m.put('a', 3);   //90
	 m.put('C', 1);    //67
	// System.out.println(m);
  }
  
  public int meth1(int num)
  {
	  //System.out.println("meth called " +num);
	  return num;
  }
  
}
