public class AppPuzzle {
    public static void main(String[] args) {

        Puzzle puzzle = new Puzzle();
        puzzle.data[0] = 8;
        puzzle.data[1] = 2;
        puzzle.data[2] = 4;
        puzzle.data[3] = 1;
        puzzle.data[4] = 6;
        puzzle.data[5] = 5;
        puzzle.data[6] = 3;
        puzzle.data[7] = 0;
        puzzle.data[8] = 7;

        System.out.println(puzzle);
        System.out.println("Posisi Nol = " + puzzle.posisiNol());

        puzzle.moveDown();
        puzzle.moveDown();
        puzzle.moveDown();

        System.out.println(puzzle);
        System.out.println("Posisi Nol = " + puzzle.posisiNol());

    }
}
