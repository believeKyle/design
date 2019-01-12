package 抽象工厂模式;

public abstract class AbstractYellowHuman implements Human {
	public void getColor() {
		System.out.println("黄色人种的皮肤是黄色的");
	}
	
	public void talk() {
		System.out.println("黄人会说话，一般听不懂");
	}
}
