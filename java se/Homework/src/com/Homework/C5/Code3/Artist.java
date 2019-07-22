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
		System.out.println("大家好，我是杨幂。");
		a.playMovie();
		a.playSong();
		a.playTV();
	}
	
	

	@Override
	public void playSong() {
		// TODO 自动生成的方法存根
		System.out.println("我会唱歌。");
	}

	@Override
	public void playTV() {
		// TODO 自动生成的方法存根
		System.out.println("我能演电视剧。");
	}

	@Override
	public void playMovie() {
		// TODO 自动生成的方法存根
		System.out.println("我能演电影。");
	}
	

}
