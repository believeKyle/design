package 依赖倒置原则;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BMW implements ICar {
	public void run() {
		System.out.println("宝马车开始运行...");
	}
}
