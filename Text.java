import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class Text {

	Work w= new Work("a",1,6);
	Work w1= new Work("b",2,2);
	List<Work> list = new ArrayList<Work>();
	List<Work> list1 = new ArrayList<Work>();
    list.add(w1);
    list.add(w);
    Schedule s = new Schedule();
    list1=s.add(w);
    list1=s.add(w1);
	
	@Test
	public void test() {
		assertEquals(list1,s.FCFS(list));
	}
	
	@Test
	public void test1() {
		assertEquals(list,s.FCFS(list1));
	}

}
