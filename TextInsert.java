
import static org.junit.Assert.*;

import org.junit.Test;

public class TextInsert {
    Sorting s = new Sorting();
    int [] num = new int[]{9,7,5,3,2,1,0};
    int [] num1 = new int[]{0,1,2,2,4};
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals("false",s.isSorted(num));
	}
	@Test
	public void test1() {
		s.insertionSort(num);
	}
	@Test
	public void test2() {
		s.quicksort(num, 1, 6);
	}
	@Test
	public void test3() {
		s.insertionSort(num,1,6);
	}
	@Test
	public void test4() {
		s.quicksort(num, 2,4);
	}

}