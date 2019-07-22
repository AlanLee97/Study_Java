package com.libuguan.ex11;

public abstract class Employee {
		private String id;
		private String name;
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public abstract void work();
		
		
}
