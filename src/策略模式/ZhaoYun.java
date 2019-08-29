package 策略模式;

public class ZhaoYun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;
		System.out.println("第一个-------");
		context = new Context(new BackDoor());
		context.operate();
	}

}
