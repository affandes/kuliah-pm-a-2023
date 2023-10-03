public class Puzzle {
    public int[] data = new int[9];

    @Override
    public String toString() {
        String output = data[0] + " | " + data[1] + " | " + data[2] + "\n";
        output += data[3] + " | " + data[4] + " | " + data[5] + "\n";
        output += data[6] + " | " + data[7] + " | " + data[8] + "\n";
        return output;
    }

    public int posisiNol() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public void moveDown() {
        int nol = posisiNol();
        if (nol >= 3) {
            int t = data[nol];
            data[nol] = data[nol-3];
            data[nol-3] = t;
        } else {
            System.out.println("Gak bisa");
        }
    }
}
