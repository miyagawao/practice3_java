class Main {
  public static void main(String[] args) {
    // printDataメソッドを呼び出してください
    // 引数に「Kate Jones」を渡してください
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones", 27);
    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith", 65);
  }
  
  // printDataメソッドを定義してください
   // 引数を受け取るようにしてください
   // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    // 「私の名前は◯◯です」と出力
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "です");
  }
}