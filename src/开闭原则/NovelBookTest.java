package 开闭原则;

import static org.junit.Assert.*;

import javax.security.sasl.AuthorizeCallback;

import org.junit.Test;

import junit.framework.TestCase;

public class NovelBookTest extends TestCase{

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	private String name = "平凡的世界";
	private int price = 6000;
	private String author = "路遥";
	private IBook novelBook = new NovelBook(name, price, author);
	
	public void testGetPrice() {
		super.assertEquals(this.price, this.novelBook.getPrice());
	}
			
}
