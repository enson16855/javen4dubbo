package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enson.custom.action.DubboAction;

public class Custom {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();

		DubboAction dubboAction = (DubboAction) context.getBean("dubboAction"); // 获取远程服务代理
		String word = dubboAction.printWord();// 执行远程方法

		System.out.println(word); // 显示调用结果

	}

}
