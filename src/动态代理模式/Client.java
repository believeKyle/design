package 动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import 代理模式.GamePlayer;
import 代理模式.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("张三");
		InvocationHandler handler = new GamePlayerIH(player);
		System.out.println("开始时间是:2009-08-25");
		ClassLoader cl = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是:2009-08-26");
	}

}
