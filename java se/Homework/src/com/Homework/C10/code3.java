package com.Homework.C10;

/**
 * 3. ʹ��IO���е����ȡD����exam.txt�ı��ļ������ݣ�ÿ�ζ�ȡһ�����ݣ�
 *    ��ÿ����Ϊһ���������ArrayList�ķ��ͼ����в��������е�����ʹ�ü�ǿfor���������ʾ��
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
		String path = "C:\\Users\\14456\\Desktop\\��ʱ�ļ�\\java1\\text.txt";
		outputMethod(path);
	}

	public static void outputMethod(String path) throws IOException {
		List<String> list = new ArrayList<String>(); // �������϶���
		// ��������������
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = br.readLine(); // ��ȡ����ÿ�ζ�һ��
		while (line != null) {
			list.add(line);
			line = br.readLine();
		}
		br.close(); // �ر�
		for (String s : list) {
			System.out.println(s);
		}
	}
}

