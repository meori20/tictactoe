package com.gavri.tictactoe.gameService.dataModels.impel;

import com.gavri.tictactoe.gameService.dataModels.interfaces.IGameDetailsDM;

public class GameDetailsDM implements  IGameDetailsDM {
	String test;
	
	@Override
	public String getTest() {
		return this.test;
	}
	
	@Override
	public void setTest(String changeTest) {
		this.test = changeTest;
	}

}
