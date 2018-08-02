package com.yc.zookeeper.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private static final long serialVersionUID = 5008736790771463816L;
	private int usid;
	private String uname;
	private int age;
	
	@Override
	public String toString() {
		return "UserInfo [usid=" + usid + ", uname=" + uname + ", age=" + age + "]";
	}

	public int getUsid() {
		return usid;
	}

	public void setUsid(int usid) {
		this.usid = usid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserInfo(int usid, String uname, int age) {
		super();
		this.usid = usid;
		this.uname = uname;
		this.age = age;
	}

	public UserInfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + usid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (age != other.age)
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (usid != other.usid)
			return false;
		return true;
	}
}
