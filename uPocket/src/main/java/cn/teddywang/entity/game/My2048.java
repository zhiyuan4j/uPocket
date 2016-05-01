package cn.teddywang.entity.game;

import cn.teddywang.entity.User;

public class My2048 {
	private int id;
	private int score;//当前游戏分数
	private String save;//保存当前游戏状态
	private int maxLevel;//最大值
	private int maxScore;//历史最高分
	private User user;
	
	public My2048() {
		
	}

	public My2048(int score, String save, int maxLevel, int maxScore) {
		this.score = score;
		this.save = save;
		this.maxLevel = maxLevel;
		this.maxScore = maxScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSave() {
		return save;
	}

	public void setSave(String save) {
		this.save = save;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "My2048 [id=" + id + ", score=" + score + ", save=" + save + ", maxLevel=" + maxLevel + ", maxScore="
				+ maxScore + "]";
	}
	
}
