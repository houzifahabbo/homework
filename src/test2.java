public class test2 {
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static void main(String[] args) {
        String[] yarisPisti = new String[20];
        int range = 10 - 1 + 1,b=0,z=0;
        for (int x = 0; x < yarisPisti.length; x++) {
            yarisPisti[x] = "-";
        }
        do{
            int i = (int) (Math.random() * range) + 1;
            int h = (int) (Math.random() * range) + 1;
            if (isBetween(i, 1, 5)) {
                yarisPisti[z] = "-";
                z += 3;
                if (z > 18) {
                    z = 19;
                }
                yarisPisti[z] = "K";
            } else if (isBetween(i, 6, 7)) {
                yarisPisti[z] = "-";
                z -= 1;
                if (z < 0) {
                    z = 0;
                }
                yarisPisti[z] = "K";
            } else if (isBetween(i, 8, 10)) {
                yarisPisti[z] = "-";
                z += 1;
                yarisPisti[z] = "K";
            }
            if (isBetween(h, 1, 2)) {}
            else if (isBetween(h, 3, 4)) {
                yarisPisti[b] = "-";
                b += 9;
                if (b > 18) {
                    b = 19;
                }
                yarisPisti[b] = "T";
            }
            else if (h == 5) {
                yarisPisti[b] = "-";
                b -= 12;
                if (b < 0) {
                    b = 0;
                }
                yarisPisti[b] = "T";
            }
            else if (isBetween(h, 6, 8)) {
                yarisPisti[b] = "-";
                b += 1;
                if (b > 18) {
                    b = 19;
                }
                yarisPisti[b] = "T";
            }
            else if (isBetween(h, 9, 10)) {
                yarisPisti[b] = "-";
                b -= 2;
                if (b < 0) {
                    b = 0;
                }
                yarisPisti[b] = "T";
            }
            if(b==z){
                yarisPisti[z]="OUCH";
            }
            else if(b==19||z==19){
                if(b==19)
                {
                    System.out.println("Tavsan kazandi, yuh!");
                }
                else
                    System.out.println("Kaplumbaga kazandi oley");
                break;
            }
            for (String s : yarisPisti) {
                System.out.print(s);
            }
            System.out.println();
        } while (b != 19||z!=19);
    }
}
