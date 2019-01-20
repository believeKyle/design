package 开闭原则;


public class ComputerBook implements IComputerBook {
	private String name;
	private String scope;
	private String author;
	private int price;
	
	public ComputerBook(String _name, int _price, String _author, String _scope) {
		this.name = _name;
		this.price = _price;
		this.author = _author;
		this.scope = _scope;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
