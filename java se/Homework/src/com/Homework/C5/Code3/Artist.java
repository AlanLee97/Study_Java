package com.Homework.C5.Code3;

interface IMovie {
	void playMovie();

}

interface ITVPlay {
	void playTV();
}

interface ISong {
	void playSong();

}

public class Artist implements IMovie,ITVPlay,ISong{
	
	public static void main(String[] args) {
		Artist a = new Artist();
		System.out.println("��Һã��������ݡ�");
		a.playMovie();
		a.playSong();
		a.playTV();
	}
	
	

	@Override
	public void playSong() {
		// TODO �Զ����ɵķ������
		System.out.println("�һᳪ�衣");
	}

	@Override
	public void playTV() {
		// TODO �Զ����ɵķ������
		System.out.println("�����ݵ��Ӿ硣");
	}

	@Override
	public void playMovie() {
		// TODO �Զ����ɵķ������
		System.out.println("�����ݵ�Ӱ��");
	}
	

}
