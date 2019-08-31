package 代理模式;

public interface IGamePlayer {
	public void login(String user, String password);
	
	public void killBoss();
	
	public void upgrade();
	
	public IGamePlayer getProxy();
}
