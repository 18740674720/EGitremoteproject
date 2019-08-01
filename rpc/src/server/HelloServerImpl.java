package server;

public class HelloServerImpl implements HelloServer{

	@Override
	public String sayHi(String name) {
		return "hi" + name;
	}
	
	
	//alt+shift+s  或者窗口操作（set get一样的地方）
	@Override
	public String toString() {
		return "HelloServerImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
