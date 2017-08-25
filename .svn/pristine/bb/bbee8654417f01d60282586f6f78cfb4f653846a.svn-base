package com.chinasofti.eec.wvt.task.demo;

public class ComputerPlayer {
	private String playerName;
	private int score;
	
	
	public ComputerPlayer() {
		super();
	}
	public ComputerPlayer(String playerName) {
		this.playerName = playerName;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getScore() {
		return score;
	}
	public void addScore(){
		score++;
	}
	
	public int show(){
		int num;
		num=(int)(Math.random()*100);
		if(num<=30){
			num=1;
		}else if(num<=50){
			num=2;
		}else{
			num=3;
		}
		switch(num){
			case 1:System.out.println(playerName+"出拳：石头");break;
			case 2:System.out.println(playerName+"出拳：剪子");break;
			case 3:System.out.println(playerName+"出拳：布");break;
		}
		return num;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPlayer player=new ComputerPlayer();
		player.setPlayerName("王晓华");
		System.out.println(player.show());
	}

}
