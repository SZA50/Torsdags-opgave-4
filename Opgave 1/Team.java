//Create an entity class called Team.

class Team {
	private String teamName;
	private Integer teamsRank;
	private String playersName;

	public Team (String teamName){
		this.teamName = teamName;

	}

// 1.h 

public void setRank ( Integer ranks){
     this.teamsRank = ranks;

}
public String toString (){
	String s = "Hold" + this.teamName + " Rank "+ this.teamsRank;
	return s;

}

}