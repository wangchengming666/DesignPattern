package example;

public class Client {

	public static void main(String[] args) {

		Handler h1 = new TeamLeader();
		Handler h2 = new Manager();
		Handler h3 = new GeneralManager();
		
		//开始测试
        String test1 = h1.handleRequest("张三", 2);
        System.out.println("test1 = " + test1);
        String test2 = h3.handleRequest("李四", 2);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");
        
        String test3 = h2.handleRequest("张三", 4);
        System.out.println("test3 = " + test3);
        String test4 = h3.handleRequest("李四", 4);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");
        
        String test5 = h3.handleRequest("张三", 7);
        System.out.println("test5 = " + test5);
        String test6 = h3.handleRequest("李四", 7);
        System.out.println("test6 = " + test6);
	}

}
