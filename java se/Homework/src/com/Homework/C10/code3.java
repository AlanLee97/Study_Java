package com.Homework.C10;

/**
 * 3. 使用IO包中的类读取D盘上exam.txt文本文件的内容，每次读取一行内容，
 *    将每行作为一个输入放入ArrayList的泛型集合中并将集合中的内容使用加强for进行输出显示。
 * @author Administrator
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class code3 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\14456\\Desktop\\临时文件\\java1\\text.txt";
		outputMethod(path);
	}

	public static void outputMethod(String path) throws IOException {
		List<String> list = new ArrayList<String>(); // 创建集合对象
		// 创建缓冲区对象
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = br.readLine(); // 读取数据每次读一行
		while (line != null) {
			list.add(line);
			line = br.readLine();
		}
		br.close(); // 关闭
		for (String s : list) {
			System.out.println(s);
		}
	}
}

