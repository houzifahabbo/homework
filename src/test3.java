import java.math.*;
public class test3 {
    public static void main(String[] args) {
        String[] yarisPisti = new String[20];
        int range = 10 - 1 + 1, b = 0, z = 0;
        for (int x = 0; x < yarisPisti.length; x++) {
            yarisPisti[x] = "-";
        }
        do {
            int i = (int) (Math.random() * range) + 1;
            int h = (int) (Math.random() * range) + 1;
            switch (i) {
                case 1: case 2: case 3: case 4: case 5:
                    yarisPisti[z] = "-";
                    z += 3;
                    if (z > 18) {
                        z = 19;
                    }
                    yarisPisti[z] = "K";
                case 6: case 7:
                    yarisPisti[z] = "-";
                    z -= 1;
                    if (z < 0) {
                        z = 0;
                    }
                    yarisPisti[z] = "K";
                case 8: case 9: case 10:
                    yarisPisti[z] = "-";
                    z += 1;
                    yarisPisti[z] = "K";
            }
            switch (h) {
                case 1: case 2:
                    break;
                case 3: case 4:
                    yarisPisti[b] = "-";
                    b += 9;
                    if (b > 18) {
                        b = 19;
                    }
                    yarisPisti[b] = "T";
                    break;
                case 5:
                    yarisPisti[b] = "-";
                    b -= 12;
                    if (b < 0) {
                        b = 0;
                    }
                    yarisPisti[b] = "T";
                    break;
                case 6: case 7:case 8:
                    yarisPisti[b] = "-";
                    b += 1;
                    if (b > 18) {
                        b = 19;
                    }
                    yarisPisti[b] = "T";
                    break;
                case 9: case 10:
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
                if(b==19) {System.out.println("Tavsan kazandi, yuh!");}
                else
                    System.out.println("Kaplumbaga kazandi oley");
                break;
            }
            for (String s : yarisPisti) {
                System.out.print(s);
            }
            System.out.println();
        }while (b != 19||z!=19);
    }
}

