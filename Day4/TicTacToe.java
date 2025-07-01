import java.util.Scanner;

public class TicTacToe {
    char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public void displayBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            char player = (i % 2 == 0) ? 'X' : 'O';
            System.out.println("Player " + player + ", enter your move (0-8):");
            int move = sc.nextInt();

            // Check if the cell is already taken
            if (move < 0 || move > 8 || board[move] != ' ') {
                System.out.println("Invalid move, try again.");
                i--; // retry the same turn
                continue;
            }

            board[move] = player;
            displayBoard();
        }
    }

    public static void main(String args[]) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
