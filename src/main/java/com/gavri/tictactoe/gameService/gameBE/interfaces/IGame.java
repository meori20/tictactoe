package com.gavri.tictactoe.gameService.gameBE.interfaces;

import com.gavri.tictactoe.gameService.dataModels.impel.GameDetailsDM;

public interface IGame {

	GameDetailsDM requestLogicChanges(GameDetailsDM gameStatus);

}
