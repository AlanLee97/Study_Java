package com.libuguan.ex11;

public class JavaEE extends Employee {

	@Override
	public void work() {
		System.out.println("员工号为：" + getId() + "的" + getName()
		+ "员工正在研发淘宝网站。");

	}

}
