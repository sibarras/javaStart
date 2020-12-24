public class Variables {
    public static void main(String[] args) {
        // primitive
        int int_number = 5;
        double num2 = 5.3;
        boolean logic = true;
        char c = 'f';
        // non primitive
        String word = "Samuel";

        // Printing
        System.out.println(int_number);
        System.out.println(num2);
        System.out.println(logic);
        System.out.println(c);
        System.out.println(word);
        
        // It copy the variable, dont use the same memory.
        int other_num = int_number;
        other_num = 0;
        
        System.out.println(int_number);
        System.out.println(other_num);

    }
}
