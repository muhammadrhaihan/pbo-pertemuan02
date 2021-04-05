import java.util.Scanner;

public class InputOutput{
 public static void main(String[]args){
  
   String nama;
   int jumlahSks;
   double IPK;
  
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Input nama : ");
   nama = scanner.nextLine();

   System.out.print("Input usia : ");
   usia = scanner.nextInt();

   System.out.print("Input IPK : ");
   IPK = scanner.nextDouble();

   System.out.println("Hai " + nama);
   System.out.println("usia : " + usia);
   System.out.println("IPK : " + IPK);
 }
}