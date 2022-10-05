import java.util.*;


public class LuasLingkaran {
    private int r;
    public void setjari2(int jari2){
        this.r = jari2;
    }
    public double luasL(){
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasLingkaran lingkaran = new LuasLingkaran();

        // jari2
        System.out.print("Jari-jari lingkaran = ");
        lingkaran.setjari2(input.nextInt());

        //luas
        System.out.println("Luas Lingkaran = " + Math.PI +" * "+ lingkaran.r +" * " + lingkaran.r +" = "+ lingkaran.luasL());


    }
}
