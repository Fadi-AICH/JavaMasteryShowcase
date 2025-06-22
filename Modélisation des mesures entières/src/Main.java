import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner Clavier = new Scanner(System.in);
         int Input;
        do{
            System.out.println("Entrez Une Valeur : ");
            Input = Clavier.nextInt();
            Clavier.nextLine();
            Mesure M = Input == 0 ? null : new Mesure(Input);
        }while(Input != 0);

        Mesure.AfficherMoyenne();
/*
        Mesure m1 = new Mesure(10);
        Mesure m2 = new Mesure(404);
        Mesure m3 = new Mesure(-10);
        Mesure m4 = new Mesure(60);

        Mesure.AfficherMoyenne();
*/
    }
}