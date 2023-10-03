public class AppPuzzle {
    public static void main(String[] args) {

        Puzzle puzzle = new Puzzle(new int[]{8,2,4,1,6,5,3,0,7});

        System.out.println(puzzle);
        System.out.println("Posisi Nol = " + puzzle.posisiNol());

        Puzzle[] puzzles = new Puzzle[4];

        puzzles[0] = puzzle.moveDown();;
        puzzles[1] = puzzle.moveRight();
        puzzles[2] = puzzle.moveLeft();
        puzzles[3] = puzzle.moveUp();

        for (int i = 0; i < puzzles.length; i++) {
            System.out.println(puzzles[i]);
        }

        // Buat Queue int



    }
}
