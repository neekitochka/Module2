
public class Module2 {
    public static void main(String[] args) {
        int[] array1 = {44, 32, 86, 19};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3};
        System.out.println("Задача №1. Ответ:  " + repeat("hello", 4));
        System.out.println("Задача №2. Ответ:  " + differenceMaxMin(array1));
        System.out.println("Задача №3. Ответ:  " + isAvgWhole(array2));
        System.out.println("Задача №4. Ответ:  " + cumulativeSum(array3));
        System.out.println("Задача №5. Ответ:  " + getDemicalPlaces("43.23330"));
        System.out.println("Задача №6. Ответ:  " + Fibonacci(12));
        System.out.println("Задача №7. Ответ:  " + isValid("59020"));
        System.out.println("Задача №8. Ответ:  " + isStrangePair("уауау", "ауауау"));
        System.out.println("Задача №9,1. Ответ:  " + isPrefix("automation", "auto-"));
        System.out.println("Задача №9,2. Ответ:  " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("Задача №10. Ответ:  " + boxSeq(1));
    }

    //Задача №1
    public static String repeat(String a, int k) {
        String nw = " ";
        for (int i = 0; i < a.length(); i++){
            char sym = a.charAt(i);
            for (int j = 1; j <= k; j++){
                nw += sym;
            }
        }
        return nw;
    }

    //Задача №2
    public static int differenceMaxMin(int arr[]) {
        int max = -100000;
        int min = 100000;
        int diff;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        return diff = max - min;
    }

    //Задание №3
    public static boolean isAvgWhole(int arr[]) {
        double avr = 0;
        for (int i = 0; i < arr.length; i++)
            avr += arr[i];
        avr = 1.0 * avr/arr.length;
        if (avr % 2==0){
            return true;
        }
        else  {
            return false;
        }

    }

    //Задание №4
    public static int[] cumulativeSum(int arr[]) {
        int[] newarr = new int [arr.length];
        for (int i = 1; i < arr.length; i++){
            newarr[i] = arr[i] + arr[i-1];
        }
        return newarr;
    }

    //Задание №5
    public static int getDemicalPlaces(String number) {
        int kol = 0;
        for (int i = 0; i < number.length(); i++ ){
            if (number.charAt(i) == '.'){
                kol = 0;
            }
            else{
                kol++;
            }
        }
        return kol;
    }

    //Задание №6
    public static int Fibonacci(int num) {
        int x = 1;
        int y = 1;
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            sum = x + y;
            y = x + y;
            x = y - x;
        }
        return sum;
    }

    //Задание №7
    public static boolean isValid(String str){
        try {
            double num = Double.parseDouble(str);
        } catch (NumberFormatException e){
            return false;
        }
        return str.length() <= 5;
    }

    //Задание №8
    public static boolean isStrangePair(String str1, String str2){
        return str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    //Задание №9
    public static boolean isPrefix(String str1, String str2){
        for (int i =0; i < str2.length()-1; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String str1, String str2){
        for (int i = str1.length() - str2.length() +1; i < str2.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //Задание №10
    public static int boxSeq(int shag) {
        int num = 0;
        for (int i = 1; i <= shag; i++) {
            if (i % 2 == 1) {
                num += 3;
            }
            else
                num -= 1;
        }
        return num;
    }
}
