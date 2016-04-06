import static org.junit.Assert.*;

import org.junit.Test;

public class TextInsert {
    Sorting s = new Sorting();
    int [] num = new int[]{2,1,4,2,0,5,6,7};
    int [] num1 = new int[]{0,1,2,2,4};
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals("false",s.isSorted(num));
	}
	@Test
	public void test1() {
		assertEquals(1,s.insertionSort(num));
	}
	@Test
	public void test2() {
		assertEquals(3,s.quicksort(num, 1, 6));
	}
	@Test
	public void test3() {
		assertEquals(2,s.insertionSort(num,1,6));
	}
	@Test
	public void test4() {
		assertEquals(5,s.swap(num, 2, 4));
	}

}
