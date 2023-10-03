public class SintakValidator {
    public static void main(String[] args) {

        String rumus = "(24 + (12 x 2) / {3)}";
        String rumus2 = "(24 + (12 x 2) / 3)";


        if (cekSintaks(rumus)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    public static boolean cekSintaks(String rumus) {

        StackChar stack = new StackChar(5);

        for (int i = 0; i < rumus.length(); i++) {

            char karakter = rumus.charAt(i);

            // Cek buka kurung
            if (karakter == '(') stack.push(karakter);
            if (karakter == '{') stack.push(karakter);

            // Cek tutup kurung
            if (karakter == ')' && stack.peek() == '(') {
                char hasilPop = stack.pop();
                if (hasilPop == ' ') return false;
            }

            // Cek tutup kurung
            if (karakter == '}' && stack.peek() == '{') {
                char hasilPop = stack.pop();
                if (hasilPop == ' ') return false;
            }

        }

        return stack.isEmpty();

    }

    public static boolean checkTandaKurung(String rumus) {
        int buka = 0;
        int tutup = 0;

        for (int i = 0; i < rumus.length(); i++) {
            char karakter = rumus.charAt(i);

            if (karakter == '(') {
                buka++;
            } else if (karakter == ')') {
                tutup++;

                if (tutup > buka)
                return false;
            }
        }
        return buka == tutup;
    }
}
