import java.text.DecimalFormat;
import java.util.*;

public class Main {
    static boolean isLetter(Character ch){
        return (!(ch.toString().toLowerCase().equals(ch.toString().toUpperCase()))) || ch.toString().equals(" ");
    }

    public static void main(String[] args) {
        // часть А
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите текст");
        String text1 = scanner1.nextLine();
        char[] textCharArray =  text1.toCharArray();
        for (int i = 0; i < textCharArray.length; i++) {
            if (isLetter(textCharArray[i])){
                System.out.print(textCharArray[i]);
            }
        }
        System.out.println();
        // часть В
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите текст");
        String text2 = scanner2.nextLine();
        char[] arr = text2.toCharArray();
        int real = text2.length()/3;
        int flt = Character.getNumericValue(String.format("%.1f",(double)text2.length()/3).charAt(2));
        char[] result = new char[text2.length()];

        if (flt == 0){
            for (int i = 0; i < real; i++) {
                result[i*3]= arr[i];
            }
            for (int i = 0; i < real; i++) {
                result[i*3 + 1]= arr[i+real];
            }
            for (int i = 0; i < real; i++) {
                result[i*3 + 2]= arr[i+real*2];
            }
        }
        if (flt == 3){
            for (int i = 0; i < real+1; i++) {
                result[i*3]= arr[i];
            }
            for (int i = 0; i < real; i++) {
                result[i*3 + 1]= arr[i+real+1];
            }
            for (int i = 0; i < real; i++) {
                result[i*3 + 2]= arr[i+(real*2)+1];
            }
        }
        if (flt == 7){
            for (int i = 0; i < real+1; i++) {
                result[i*3]= arr[i];
            }
            for (int i = 0; i < real+1; i++) {
                result[i*3 + 1]= arr[i+real+1];
            }
            for (int i = 0; i < real; i++) {
                result[i*3 + 2]= arr[i+(real*2)+2];
            }
        }
        System.out.println(result);
    }
}