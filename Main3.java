class Main3 {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);

    printData(fullName("John", "Chistopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");

    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
    double bmi = bmi(height, weight);
    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
    System.out.println("BMIは" + bmi + "です");
    
    // isHealthyメソッドの結果で条件分岐を行ってください
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }

  }


  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  // bmiメソッドを定義してください
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  
  // isHealthyメソッドを定義してください
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25;
  }
}