public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 2)); //3
        System.out.println(subtraction(5,3)); //2
        System.out.println(multiplication(4,5)); //20
        System.out.println(division(20,4)); //5
        System.out.println(modulus(15,3)); //0
    }

    public static int addition(int var1, int var2){
        return var1 + var2;
    }
    public static int subtraction(int var1, int var2){
        return var1 - var2;
    }
    public static int multiplication(int var1, int var2){
       return var1 * var2;
    }
    public static int division(int var1, int var2){
        return var1 / var2;
    }
    public static int modulus(int var1, int var2){
        return var1 % var2;
    }
}
