import java.math.*;
class Harketler{

}
class Kaplumbaga{

}
class Tavsan{

}
public class BirinciSoru {
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static void main(String[] args) {
        String[] yarisPisti = new String[20];
        int range = 10 - 1 + 1;
        for (int x = 0; x < yarisPisti.length; x++) {
            yarisPisti[x] = "-";
        }
        int b = 0;
        int z = 0;
        for (b=0,z=0;b<=19||z<=19;b++,z++) {

            //do {
            //do {
            //for(int x=0;x< yarisPisti.length;x++){
            // if (yarisPisti[19]=="T"||yarisPisti[19]=="K"){
            //break;
            //}
            int i = (int) (Math.random() * range) + 1;
            int h = (int) (Math.random() * range) + 1;
            if (isBetween(i, 1, 5)) {
                yarisPisti[z] = "-";
                z += 3;
                if (z > 18) {
                    z = 19;
                }
                yarisPisti[z] = "T";
            } else if (isBetween(i, 6, 7)) {
                yarisPisti[z] = "-";
                z -= 1;
                if (z < 0) {
                    z = 0;
                }
                yarisPisti[z] = "T";
            } else if (isBetween(i, 8, 10)) {
                yarisPisti[z] = "-";
                z += 1;
                yarisPisti[z] = "T";
            }
                /*for (String s : yarisPisti) {
                    System.out.print(s);
                }
                System.out.println(z);*/
            //} while (z != 19);
            //while (yarisPisti[19]!="T"||yarisPisti[19]!="K");

            //do {
            //for(int x=0;x< yarisPisti.length;x++){
            // if (yarisPisti[19]=="T"||yarisPisti[19]=="K"){
            //break;
            //}

            if (isBetween(h, 1, 2)) {
            } else if (isBetween(h, 3, 4)) {
                yarisPisti[b] = "-";
                b += 9;
                if (b > 18) {
                    b = 19;
                }
                yarisPisti[b] = "K";
            } else if (h == 5) {
                yarisPisti[b] = "-";
                b -= 12;
                if (b < 0) {
                    b = 0;
                }
                yarisPisti[b] = "K";
            } else if (isBetween(h, 6, 8)) {
                yarisPisti[b] = "-";
                b += 1;
                if (b > 18) {
                    b = 19;
                }
                yarisPisti[b] = "K";
            } else if (isBetween(h, 9, 10)) {
                yarisPisti[b] = "-";
                b -= 2;
                if (b < 0) {
                    b = 0;
                }
                yarisPisti[b] = "K";
            }
            for (String s : yarisPisti) {
                System.out.print(s);
            }
            System.out.println(b);
            // } while (b != 19);
            //} while (z != 19 ||b != 19);
        }
    }
}
