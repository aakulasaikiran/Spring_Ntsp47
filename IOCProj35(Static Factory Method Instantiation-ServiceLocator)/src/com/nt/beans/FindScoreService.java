package com.nt.beans;

import com.nt.extenal.ScoreCardComp;

public class FindScoreService {
	private ScoreCardComp comp;

	public void setComp(ScoreCardComp comp) {
		this.comp = comp;
    }
	public String viewScore(int matchId){
		//Find score throiugh exteranl service comp
		String score=comp.findScore(matchId);
		return score;
	}

}
