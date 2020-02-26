import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bicycle1.printData();
    System.out.println("-----------------");
    Scanner scanner = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int runDistance = scanner.nextInt();
    bicycle1.run(runDistance);
    System.out.println("=================");
    Car car1 = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car1.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int runCarDistance = scanner.nextInt();
    car1.run(runCarDistance);
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
     int chargeFuel = scanner.nextInt();
    car1.charge(chargeFuel); 
  }
}
