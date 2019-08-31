package 动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler{
	Class cls = null;
	
	Object obj = null;
	
	public GamePlayerIH(Object _obj) {
		this.obj = _obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		Object result = method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登录!");
		}
		
		return result;
	}
}











