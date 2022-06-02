 abstract class Yiyecek {
    private String isim;
    private String renk;
    private String yetistigiYer;

    public Yiyecek(String i,String r, String y){
        this.isim=i;
        this.renk=r;
        this.yetistigiYer = y;
    }
    public void set(String renk,String isim){
        this.renk = renk;
        this.isim = isim;
    }
    public void set(String renk,String isim,String yetistigiYer){
        this.yetistigiYer = yetistigiYer;
        this.renk = renk;
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public String getRenk() {
        return renk;
    }
    public String getYetistigiYer() {
        return yetistigiYer;
    }
    public String YiyecekTuru(){
        return "belirsiz";
    }
}
class Meyve extends Yiyecek{
    public Meyve(String i, String r) {
        super(i, r,"ağaç");
    }
    @Override
    public String YiyecekTuru() {
        return getIsim()+" bir meyvedir";
    }
}

class Sebze extends Yiyecek{
    public Sebze(String i, String r) {
        super(i,r,"toprak");
    }
    @Override
    public String YiyecekTuru() {
        return getIsim()+" bir sebzedir";
    }
}

public class MainIkinciSoru {

    public static void bilgigoster(Yiyecek Y1){
        if(Y1 instanceof Sebze){
            System.out.println(Y1.getRenk()+Y1.YiyecekTuru()+"\nYetiştiği yer: "+Y1.getYetistigiYer()+"\n");
        }
        else if(Y1 instanceof Meyve){
            System.out.println(Y1.getRenk()+Y1.YiyecekTuru()+"\nYetiştiği yer: "+Y1.getYetistigiYer()+"\n");
        }
    }

    public static void main(String[] args) {
        Yiyecek s=new Sebze(" lahana","kırmızı");
        Yiyecek m=new Meyve(" elma","yeşil");

        bilgigoster(s);
        bilgigoster(m);
    }
}