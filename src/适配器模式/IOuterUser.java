package 适配器模式;

import java.util.Map;

public interface IOuterUser {
	public Map getUserBaseInfo();
	public Map getUserOfficeInfo();
	public Map getUserHomeInfo();
}
