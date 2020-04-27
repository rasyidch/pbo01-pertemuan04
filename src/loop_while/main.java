package loop_while;

public class main{
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang :" + isiGelas + "ml");
        System.out.println("Isi Gelas Sekarang :" + isiGelas + "ml");

            while (isiGelas != penuh){
                isiGelas++;
                System.out.println("sedang mengisi gelas");
                System.out.println("isi gelas sekarang :"+isiGelas+"ml");
            }
        System.out.println("finale : isi gelas sekarang :"+isiGelas+"ml");
    }

}
