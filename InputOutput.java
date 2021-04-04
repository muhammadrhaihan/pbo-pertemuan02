import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahSKS;
  double IPK;

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