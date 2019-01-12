package 抽象工厂模式;

public abstract class AbstractWhiteHuman implements Human{
	public void getColor() {
		System.out.println("白色人种的皮肤是白色的");
	}
	
	public void talk() {
		System.out.println("白色人种会说话，一般说的是单字节");
	}
}
