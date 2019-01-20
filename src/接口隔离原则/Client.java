package 接口隔离原则;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGoodBodyGirl yanyan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanyan);
		searcher.show();
	}

}
