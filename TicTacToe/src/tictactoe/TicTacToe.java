package tictactoe;

public class TicTacToe {

    protected char[] board;
    protected char useMarker;
    protected char aiMarker;
    protected char currentMarker;
    protected char winner;

    public TicTacToe(char playerToken, char aiMarker){
        this.useMarker = playerToken;
        this.aiMarker = aiMarker;
        this.board = setBoard();
        this.winner = '-';
    }

   public static char[] setBoard(){
        char[] board = new char[9];
        for (int i=0; i<board.length; i++){
            board[i]='-';
        }
        return board;
   }

   public boolean playTurn(int spot){
        boolean isValid = withinRange()
   }

}
