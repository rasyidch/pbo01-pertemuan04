package loop_while;

public class do_while {
    public static void main(String[] args){
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang :" + isiGelas + "ml");
        System.out.println("Isi Gelas Sekarang :" + isiGelas + "ml");

        do {

            isiGelas++;
            System.out.println("sedang mengisi gelas");
            System.out.println("isi gelas sekarang :"+isiGelas+"ml");
        }while (isiGelas != penuh);
        System.out.println("Finale : isi gelas sekarang :"+ isiGelas);


        }

}
