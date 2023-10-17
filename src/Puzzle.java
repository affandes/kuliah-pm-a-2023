public class Puzzle {
    public int[] data = new int[9];

    @Override
    public String toString() {
        String output = data[0] + " | " + data[1] + " | " + data[2] + "\n";
        output += data[3] + " | " + data[4] + " | " + data[5] + "\n";
        output += data[6] + " | " + data[7] + " | " + data[8] + "\n";
        return output;
    }

    public Puzzle(int[] data) {
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    public int posisiNol() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public Puzzle moveDown() {
        int nol = posisiNol();
        Puzzle puzzleBaru = new Puzzle(data);
        if (nol >= 3) {
            int t = puzzleBaru.data[nol];
            puzzleBaru.data[nol] = puzzleBaru.data[nol-3];
            puzzleBaru.data[nol-3] = t;
        } else {
            System.out.println("Gak bisa");
        }
        return puzzleBaru;
    }

    public Puzzle moveUp() {
        int nol = posisiNol();
        Puzzle puzzleBaru = new Puzzle(data);
        if (nol < 6) {
            int t = puzzleBaru.data[nol];
            puzzleBaru.data[nol] = puzzleBaru.data[nol+3];
            puzzleBaru.data[nol+3] = t;
        } else {
            System.out.println("Gak bisa");
        }
        return puzzleBaru;
    }

    public Puzzle moveLeft() {
        int nol = posisiNol();
        Puzzle puzzleBaru = new Puzzle(data);
        if (nol != 2 && nol !=5 && nol !=8) {
            int t = puzzleBaru.data[nol];
            puzzleBaru.data[nol] = puzzleBaru.data[nol+1];
            puzzleBaru.data[nol+1] = t;
        } else {
            System.out.println("Gak bisa");
        }
        return puzzleBaru;
    }

    public Puzzle moveRight() {
        int nol = posisiNol();
        Puzzle puzzleBaru = new Puzzle(data);
        if (nol != 0 && nol != 3 && nol != 6) {
            int t = puzzleBaru.data[nol];
            puzzleBaru.data[nol] = puzzleBaru.data[nol-1];
            puzzleBaru.data[nol-1] = t;
        } else {
            System.out.println("Gak bisa");
        }
        return puzzleBaru;
    }

    public Puzzle[] next() {
        int nol = posisiNol();
        Puzzle[] puzzles;
        if (nol == 0) {
            puzzles = new Puzzle[2];
            // LU
            puzzles[0] = moveLeft();
            puzzles[1] = moveUp();
        } else if (nol == 1) {
            // LRU
        } else if (nol == 2) {
            // RU
        } else if (nol == 3) {
            // LDU
        } else if (nol == 4) {
            // LRDU
        } else if (nol == 5) {
            // RDU
        } else if (nol == 6) {
            // LD
        } else if (nol == 7) {
            // LRD
        } else {
            // RD
        }
        return puzzles;
    }

    public Puzzle[] cariSolusi(Puzzle start, Puzzle finish) {

        QueuePuzzle queue = new QueuePuzzle();

        queue.enqueue(start);
        boolean sudahKetemuSolusi = false;

        while (!sudahKetemuSolusi && !queue.isEmpty() ) {

            Puzzle currentPuzzle = queue.dequeue();
            if (currentPuzzle.equals(finish)) {
                sudahKetemuSolusi = true;
            } else {
                Puzzle[] puzzles = next();
                queue.enqueue(filterVisited(puzzles));
            }

        }

    }
}
