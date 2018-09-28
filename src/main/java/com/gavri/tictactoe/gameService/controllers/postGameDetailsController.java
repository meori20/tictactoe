package com.gavri.tictactoe.gameService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gavri.tictactoe.gameService.dataModels.impel.GameDetailsDM;
import com.gavri.tictactoe.gameService.gameBE.interfaces.IGame;


@RestController
public class postGameDetailsController {
	
	@Autowired
	private IGame game;
	
	//http://localhost:8085/postGameDetails
	@RequestMapping(value = "/postGameDetails", method= RequestMethod.POST , consumes= {"application/json"} , produces = {"application/json"})
	public @ResponseBody GameDetailsDM postGameDetails(@RequestBody GameDetailsDM request) {
		
		
		
		return game.requestLogicChanges(request);
		
	}
	

}
