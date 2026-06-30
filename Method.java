public class Method {
  public int addNumbers(int num1 ,int num2){
    return num1+num2;
  } 
  public static void main(String[] args) {
    Method obj = new Method();
    System.out.println(obj.addNumbers(11,22));
  }
}
