import java.util.Scanner;

public class InputOutput{
<<<<<<< HEAD
 public static void main(String[]args){
  
   String nama;
   int usia;
   double IPK;
  
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Input nama : ");
   nama = scanner.nextLine();
=======
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahSKS;
  double IPK;
>>>>>>> parent of e1251df (Perbaikan)

  System.out.print("Masukan nama anda : ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukan Jumlah SKS yang sudah ditempuh anda : ");
  jumlahSKS = scanner.nextInt();

  System.out.print("Masukan IPK Sementara : ");
  IPK = scanner.nextDouble();

  double jumlah = IPK * jumlahSKS;
  System.out.print("Total Nilai = "+jumlah);
 }
}