package com.nt.extenal;

public class ScoreCardCompImpl implements ScoreCardComp {
	
	@Override
	public String findScore(int matchId) {
		
		if(matchId==1001)
			return "300/4";
		else if(matchId==1002)
			return "200/5";
		else
			return "Uknown MatchId";
	}

}
