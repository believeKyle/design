package 开闭原则;


public class NovelBook implements IBook {
	private String name;
	
	private int price;
	
	private String author;
	
	public NovelBook(String _name, int _price, String _author) {
		this.name = _name;
		this.price = _price;
		this.author = _author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
