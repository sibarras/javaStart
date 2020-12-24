public class BasicOperations {
    public static void main(String[] args) {
        //  Puedes inicializar variables sin haberles asignado un valor.
        int x;
        x = 5;
        int y = 10;
        int z = 56;
        int sum = x + y + z;
        int pow = x*y*z;
        //  Solo deuvelve un entero
        int myFunc = (x+y)/(z-y);
        // devuelve un decimal pero del entero anterior
        double myFunc2 = (x+y)/(z-y);
        //  Para que sea valido tienes que operar al menos un double
        // para que devuelva un decimal.
        double u = 56;
        double myFunc3 = (x+y)/(u-y);
        // Puedes hacerlo tambien cambiando el tipo en la misma linea
        double myFunc4 = (x+y)/((double)z-y);

        // Exponents
        double ans = Math.pow(x, y);

        System.out.println(sum);
        System.out.println(pow);
        System.out.println(myFunc);
        System.out.println(myFunc2);
        System.out.println(myFunc3);
        System.out.println(myFunc4);
        System.out.println(ans);



    }
}
