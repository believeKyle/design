package 代理模式;


public class GamePlayerProxy implements IGamePlayer, IProxy{
	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer _gamePlayer) {
		this.gamePlayer = _gamePlayer;
	}
	
	/*public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this, name);
		}catch (Exception e) {
			
		}
	}*/
	
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}
	
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	public IGamePlayer getProxy() {
		return this;
	}
	
	public void count() {
		System.out.println("升级总费用是:150元");
	}
}



















