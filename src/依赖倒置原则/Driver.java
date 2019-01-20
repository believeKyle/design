package 依赖倒置原则;

public class Driver implements IDriver {
	public void drive(ICar car) {
		car.run();
	}
}
