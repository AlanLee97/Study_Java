package com.Homework.C10;
/**
 * 1.实现字节数组和任何基本类型和引用类型执行的相互转换
 *
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {

	private static final long serialVersionUID = 1L;

	int age;
	String name;

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
}

public class code1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int num = 50;
		boolean flag = true;
		User user = new User(21, "你不乖");
		// 使用数据包把数据封装起来
		// 各种数据类型----->byte[] ByteArrayOutputStream
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);// 包装流
		oos.writeInt(num);
		oos.writeBoolean(flag);
		oos.writeObject(user);
		byte[] buf = baos.toByteArray();
		baos.close();
		
		// byte[]----------->各种数据类型
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ObjectInputStream ois = new ObjectInputStream(bais);
		int num2 = ois.readInt();
		boolean flag2 = ois.readBoolean();
		User user2 = (User) ois.readObject();
		System.out.println(num2);
		System.out.println(flag2);
		System.out.println(user2);
		bais.close();
	}
}
