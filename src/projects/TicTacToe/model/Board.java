package projects.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<List<Cell>> board;

   // Constructing a board according to the dimensions passed
   // Each cell is of Type cell
    public void board(int dimension)
    {
        for(int i = 0; i < dimension; i++)
        {
            this.board.add(new ArrayList<>());
            for(int j = 0 ; j < dimension; j++)
            {
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void display()
    {
        for(int i = 0 ; i < board.size(); i++)
        {
            for(int j = 0 ; j < board.get(i).size(); j++)
            {
                if(board.get(i).get(j).getCellState().equals(CellState.EMPTY))
                {
                    System.out.print("|   |");
                }
                else
                {
                    System.out.print("|" + board.get(i).get(j).getPlayer().getSymbol() + "|");
                }
            }
        }
    }


}
