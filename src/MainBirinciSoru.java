abstract class Hareketler{
    static String[] yarisPisti = new String[20];
    int k=0,t=0;

    abstract int sag(int x);
    abstract int sol(int x);
    public static void setYarisPisti() {
        for (int x = 0; x < yarisPisti.length; x++) {
            yarisPisti[x] = "_";
        }
    }
}
class Kaplumbaga extends Hareketler{
    public int sag(int x){
        yarisPisti[k] = "_";
        k += x;
        if (k > 18) {
            return k = 19;
        }
        yarisPisti[k] = "K";
        return k;
    }
    public int sol(int x){
        yarisPisti[k] = "_";
        k -= x;
        if (k < 0) {
            return k = 0;
        }
        yarisPisti[k] = "K";
        return k;
    }
}
class Tavsan extends Hareketler{
    public int sag(int x){
        yarisPisti[t] = "_";
        t += x;
        if (t > 18) {
            return t = 19;
        }
        yarisPisti[t] = "T";
        return t;
    }
    public int sol(int x){
        yarisPisti[t] = "_";
        t -= x;
        if (t < 0) {
            return t = 0;
        }
        yarisPisti[t] = "T";
        return t;
    }
}
public class MainBirinciSoru {
    public static boolean arasında(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
    public static void main(String[] args) {
        Hareketler K1 = new Kaplumbaga();
        Hareketler T1 = new Tavsan();
        int min = 1, max = 10, range = max - min + 1;

        Hareketler.setYarisPisti();
        do {
            int kRandom = (int) (Math.random() * range) + min;
            int tRandom = (int) (Math.random() * range) + min;

            if(arasında(kRandom,1,5)) {
                K1.sag(3);
            }
            else if(arasında(kRandom,6,7)) {
                K1.sol(1);
            }
            else if(arasında(kRandom,8,10)) {
                K1.sag(1);
            }

            if(arasında(tRandom,1,2)){}
            else if(arasında(tRandom,3,4)) {
                T1.sag(9);
            }
            else if(tRandom==5) {
                T1.sol(12);
            }
            else if(arasında(tRandom,6,8)) {
                T1.sag(1);
            }
            else if(arasında(tRandom,9,10)) {
                T1.sol(2);
            }

            if(K1.k==T1.t){
                if(K1.k==19&& T1.t==19){
                    System.out.println("berabere");
                    break;
                }
                else {
                    Hareketler.yarisPisti[K1.k]="OUCH";
                }
            }
            else if(T1.t==19||K1.k==19){
                if(T1.t==19) {
                    System.out.println("Tavsan kazandi, yuh!");
                }
                else{
                    System.out.println("Kaplumbaga kazandi oley");
                }
                break;
            }

            for (String s :Hareketler.yarisPisti) {
                System.out.print(s);
            }
            System.out.println();
        } while (K1.k != 19||T1.t!=19);
    }
}