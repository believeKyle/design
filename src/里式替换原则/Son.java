package 里式替换原则;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
	@Override
	public Collection doSomething(Map map) {
		System.out.println("子类被执行");
		return map.values();
	}
}
