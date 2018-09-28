package com.gavri.tictactoe.gameService.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gavri.tictactoe.gameService.dataModels.impel.GameDetailsDM;
import com.gavri.tictactoe.gameService.dataModels.interfaces.IGameDetailsDM;
import com.gavri.tictactoe.gameService.gameBE.impel.Game;
import com.gavri.tictactoe.gameService.gameBE.interfaces.IGame;

@Configuration
public class GameConfigs {
	
	@Bean
	public IGameDetailsDM gameDetails() {
		return new GameDetailsDM();
	}
	
	@Bean
	public IGame game() {
		return new Game();
	}
	
	

}
