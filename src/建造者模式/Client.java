package 建造者模式;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		for(int i = 0;i < 1000;i++) {
			director.getABenzModel().run();
		}
	}

}
