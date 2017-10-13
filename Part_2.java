import java.util.Scanner;
public class Part_2 extends Adventure {
public char[][] board = new char[2][4];
public char[][] other = new char[2][4];
private int win = 0;
String answer = "TICKTOCK";
private int loss = 3;
public void getboard()
{
	Scanner in = new Scanner(System.in);
	int count = 0;
	System.out.println("Welcome. Welcome to my great game Wheel of Death.");
	System.out.println("You win and I let you go, you lose and you'll suffer?");
	System.out.println("In the words of Mathew Broderick. LET THE GAMES BEGIN (don't type that)");
	System.out.println("READY?");
	 for(int row = 1; row >= 0; row--)
     {
     	for(int col = 0; col < 4; col++)
        {
            board[row][col] = '-';
        }
     }
	 for(int row = 1; row >= 0; row--)
     {
     	for(int col = 0; col < 4; col++)
        {
            other[row][col] = answer.charAt(count);
     		count = count + 1;
        }
     }
	 riddle();
}
public void printBoard()
{
	 for(int row = 1; row >= 0; row--)
     {
     	for(int col = 0; col < 4; col++)
        {
     		if(col == 3)
     		{
                System.out.print(board[row][col]);
                System.out.println();
     		}
     		else
     		{
     			System.out.print(board[row][col]);
     		}
        }
     }
}
public void riddle()
{ 
	 Scanner in = new Scanner(System.in);
     System.out.println("Here is your letters D E A T H");
     board[0][0] = 'T';
     board[1][0] = 'T';
     while(win == 0)
     {
    	 printBoard();
    	 System.out.println("Guess:");
    	 String ans = in.nextLine();
    	 if(ans.equals("I"))
    	 {
    		 board[1][1] = 'I';
    	 }
    	 else if(ans.equals("C"))
    	 {
    		 board[1][2] = 'C';
    		 board[0][2] = 'C';
    	 }
    	 else if(ans.equals("K"))
    	 {
    		 board[1][3] = 'K';
    		 board[0][3] = 'K';
    	 }
    	 else if(ans.equals("O"))
    	 {
    		 board[0][1] = 'O';
    	 }
    	 else
    	 {
    		 loss = loss - 1;
    		 if(loss == 0)
    		 {
    			 endGame();
    			 break;
    		 }
    		 System.out.println("Try Again");
    		 System.out.println("You have " + loss + " more tries.");
    		 
    	 }
    	 checkWin();
     }
} 
public void checkWin()
{
	 int count = 0;
	 for(int row = 1; row >= 0; row--)
     {
     	for(int col = 0; col < 4; col++)
        {
     		count = count + 1;
     		if(board[row][col] != other[row][col])
     		{
     			break;
     		}
     		else if(board[0][3] == other[0][3] && count == 8)
     		{
     			win = 1;
     			System.out.println("YOU WIN");
     			/*Final x = new Final();
     			x.castle();	*/
     			castle();
     		}
     		
        }
     }
}
public void endGame()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Sorry but you have to cough up some money...");
	amount = amount - 10;
	//Final x = new Final();
	//x.
	castle();	
}
}
