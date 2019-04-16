*/On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.

The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.

Return the number of pawns the rook can capture in one move.

    Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: 
In this example the rook is able to capture all the pawns.
    */


class Solution {
    public int numRookCaptures(char[][] board) {
        int i,j,p=0,k=0;
        int sum=0;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                p=i;
                k=j; 
               
                break;
                }
            }
        }
              System.out.println(p+ " "+k);
            for(i=k;i<8;i++)
            {
                if(board[p][i]=='B')
                {break;}
                else if(board[p][i]=='p'){sum=sum+1;break;}
            }
        for(i=p;i<8;i++)
            {
                if(board[i][k]=='B')
                {break;}
                else if(board[i][k]=='p'){sum=sum+1;break;}
            }
        for(i=p;i>=0;i--)
            {
                if(board[i][k]=='B')
                {break;}
                else if(board[i][k]=='p'){sum=sum+1;break;}
            }
            for(i=k;i>=0;i--)
            {
                if(board[p][i]=='B')
                {break;}
                else if(board[p][i]=='p'){sum=sum+1;break;}
            }
        
        
       return sum; 
    }
}