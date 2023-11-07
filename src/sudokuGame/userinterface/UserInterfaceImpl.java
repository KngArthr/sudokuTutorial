package sudokuGame.userinterface;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sudokuGame.problemdomain.Coordinates;
import sudokuGame.problemdomain.SudokuGame;
import sudokuGame.userinterface.IUserInterfaceContract.EventListener;

public class UserInterfaceImpl implements IUserInterfaceContract.View, 
		EventHandler<KeyEvent>{
	
	private final Stage stage;
	private final Group root;
	
	//how do we keep track of 81 different text fields?
	private HashMap<Coordinates, SudokuTextField> textFiedlCoordinates;
	private IUserInterfaceContract.EventListener listener;
	
	private static final double WINDOW_Y = 732;
	private static final double WINDOW_X = 668;
	private static final double BOARD_PADDING = 50;
	private static final double BOARD_X_AND_Y = 576;	
	
	

	@Override
	public void handle(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setListener(EventListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSquare(int x, int y, int input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(SudokuGame game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDialog(String Message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError(String message) {
		// TODO Auto-generated method stub
		
	}

}
