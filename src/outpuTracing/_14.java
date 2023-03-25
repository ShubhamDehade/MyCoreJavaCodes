package outpuTracing;

public class _14 {
    public static void main(String[] args) {
        String computerMove;
        switch ( (int)(3*Math.random()) )
        {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Scissors";
                break;
            case 2:
                computerMove = "Paper";
                break;
        }
//        System.out.println("Computer's move is " + computerMove);
        // it gives compile time error as local variable is not initialized
    }
}
