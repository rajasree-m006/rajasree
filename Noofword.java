public class Noofword {
    public static void main(String[] args) {
        String s = "Hello from java programming";
        String[] arr = s.split(" "); // splits string into array
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        System.out.println(sb.toString());
    }
    
}
