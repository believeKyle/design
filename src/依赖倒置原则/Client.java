package 依赖倒置原则;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDriver zhangSan = new Driver();
		ICar benz = new Benz();
		zhangSan.drive(benz);
	}

}
