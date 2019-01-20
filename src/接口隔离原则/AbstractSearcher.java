package 接口隔离原则;

public abstract class AbstractSearcher {
	protected IGoodBodyGirl pettyGirl;
	
	public AbstractSearcher(IGoodBodyGirl _pettyGirl) {
		this.pettyGirl  = _pettyGirl;
	}
	
	public abstract void show();
}
