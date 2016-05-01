package cn.teddywang.entity;

public class User {
	private int id;
	private String nickname;//本系统的昵称
	private String username;//本系统的用户名
	private String password;//本系统的密码
	
	public User() {
		
	}
	
	public User(String nickName, String username, String password) {
		this.nickname = nickName;
		this.username = username;
		this.password = password;
	}

	public User(int id, String nickName, String username, String password) {
		super();
		this.setId(id);
		this.nickname = nickName;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickName) {
		this.nickname = nickName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", username=" + username + ", password=" + password + "]";
	}
}
