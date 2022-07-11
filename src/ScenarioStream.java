import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ScenarioStream {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(15);
		list.add(45);
		list.add(30);
		list.add(11);
		list.add(70);
		
		List list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		
		List list3 = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(list3);
		
		List list4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list4);
		
		List list5 = list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(list5);
		
		List list6 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(list6);
		
		long count = list.stream().filter(i->i<35).count();
		System.out.println(count);
	}
}
