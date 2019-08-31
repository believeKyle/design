package 代理模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = player.getProxy();
		System.out.println("开始时间是:2009-8-25");
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是:2009-8-26");
	}

}
