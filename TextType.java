import static org.junit.Assert.*;

import org.junit.Test;

public class TextType {
     Triangle t = new Triangle(-1,2,3);
     Triangle t1 = new Triangle(1,1,2);
     Triangle t2 = new Triangle(3,3,3);
     Triangle t3 = new Triangle(3,4,5);
     Triangle t4 = new Triangle(3,5,3);
  //   Triangle t5 = new Triangle(3,4,3);
    // Triangle t = new Triangle(-1,2,3);
	@Test
	public void test() {
		assertEquals("Illegal",t.getType(t));
	}
	@Test
	public void test1() {
		assertEquals("Illegal",t1.getType(t1));
	}
	@Test
	public void test2() {
		assertEquals("Regular",t2.getType(t2));
	}
	@Test
	public void test3() {
		assertEquals("Scalene",t3.getType(t3));
	}
	@Test
	public void test4() {
		assertEquals("Isosceles",t4.getType(t4));
	}
	

	
}
