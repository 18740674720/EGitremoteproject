package server;

public class HelloServerImpl implements HelloServer{

	@Override
	public String sayHi(String name) {
		return "hi" + name;
	}
	
	
	//alt+shift+s  ���ߴ��ڲ�����set getһ���ĵط���
	@Override
	public String toString() {
		return "HelloServerImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
