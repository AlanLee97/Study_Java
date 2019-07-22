package com.Homework.C10;


/**
 * 2. �����ļ���C:/Users/14456/Desktop/��ʱ�ļ�/java1���������ļ������ļ������ݵ�C:/Users/14456/Desktop/��ʱ�ļ�/java2��
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class code2 {
	/**
	 * ���Ƶ����ļ�
	 * 
	 * @param sourceFile
	 *            Դ�ļ�
	 * @param targetFile
	 *            Ŀ���ļ�
	 * @throws IOException
	 */
	public static void copyFile(File sourceFile, File targetFile) throws IOException {
		BufferedInputStream inBuff = null;
		BufferedOutputStream outBuff = null;
		try {
			// �½��ļ�������
			inBuff = new BufferedInputStream(new FileInputStream(sourceFile));
			// �½��ļ������
			outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));
			// ��������
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1) {
				outBuff.write(b, 0, len);
			}
			// ˢ�´˻���������
			outBuff.flush();
		} finally {
			// �ر���
			if (inBuff != null)
				inBuff.close();
			if (outBuff != null)
				outBuff.close();
		}
	}

	/**
	 * ����Ŀ¼
	 * 
	 * @param sourceDir
	 *            ԴĿ¼
	 * @param targetDir
	 *            Ŀ��Ŀ¼
	 * @throws IOException
	 */
	public static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
		// ���ԴĿ¼
		File fSourceDir = new File(sourceDir);
		if (!fSourceDir.exists() || !fSourceDir.isDirectory()) {
			System.out.println("ԴĿ¼������");
			return;
		}
		// ���Ŀ��Ŀ¼���粻�����򴴽�
		File fTargetDir = new File(targetDir);
		if (!fTargetDir.exists()) {
			fTargetDir.mkdirs();
		}
		// ����ԴĿ¼�µ��ļ���Ŀ¼
		File[] file = fSourceDir.listFiles();
		for (int i = 0; i < file.length; i++) {
			if (file[i].isFile()) {
				// Դ�ļ�
				File sourceFile = file[i];
				// Ŀ���ļ�
				File targetFile = new File(fTargetDir, file[i].getName());
				copyFile(sourceFile, targetFile);
			}
			// �ݹ鸴����Ŀ¼
			if (file[i].isDirectory()) {
				// ׼�����Ƶ�Դ�ļ���
				String subSourceDir = sourceDir + File.separator + file[i].getName();
				// ׼�����Ƶ�Ŀ���ļ���
				String subTargetDir = targetDir + File.separator + file[i].getName();
				// ������Ŀ¼
				copyDirectiory(subSourceDir, subTargetDir);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		copyDirectiory("C:/Users/14456/Desktop/��ʱ�ļ�/java1", "C:/Users/14456/Desktop/��ʱ�ļ�/java2");
		System.out.println("�ļ����Ƴɹ���");
	}
}
