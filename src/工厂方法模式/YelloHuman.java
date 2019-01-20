package 工厂方法模式;

public class YelloHuman implements Human {
	public void getColor() {
		System.out.println("黄色人种皮肤是黄色的");
	}
	
	public void talk() {
		System.out.println("黄色人种会说话，一般说的是双字节.");
	}
}
