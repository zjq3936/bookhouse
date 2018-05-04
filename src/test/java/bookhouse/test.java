package bookhouse;

public class test {

	public static void main(String[] args) {
		String str = "^http://www.qidian.com/all\\?orderId=[^&]*&style=[^&]*&pageSize=[^&]*&siteid=[^&]*&pubflag=[^&]*&hiddenField=[^&]*&page=[^&]*$";
		String url = "http://www.qidian.com/all?orderId=&style=1&pageSize=20&siteid=1&pubflag=0&hiddenField=0&page=1";
		
		System.out.println(url.matches(str));
		
	}
}
