

 class MyClass {
    static int a, b;
    private static String error = "Typo in operation name";

    public static void setA(int a) {
        MyClass.a = a;
    }

    public static void setB(int b) {
        MyClass.b = b;
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static String calc(int a, int b, String c) {
        switch (c) {
            case "add":
                return (String.valueOf(add(a, b)));
            case "decrease":
                return (String.valueOf(decrease(a, b)));
            case "devide":
                return (String.valueOf(devide(a, b)));
            case "multiply":
                return (String.valueOf(multiply(a, b)));
            case "exponentiation":
                return (String.valueOf(exponentiation(a, b)));
        }
        return (error);
    }

    public static String calcWithSet(String c) {
        switch (c) {
            case "add":
                return String.valueOf(((add(a, b))));
            case "decrease":
                return (String.valueOf(decrease(a, b)));
            case "devide":
                return (String.valueOf(devide(a, b)));
            case "multiply":
                return (String.valueOf(multiply(a, b)));
            case "exponentiation":
                return (String.valueOf(exponentiation(a, b)));
        }
        return (error);
    }

    public static int add(int a, int b) {
        return(a+b);
    }

    public static int decrease(int a, int b) {
        return(a-b);
    }

    public static int devide(int a, int b) {
        return(a/b);
    }

    public static int multiply(int a, int b) {
        return(a/b);
    }

    public static int exponentiation(int a, int b) {
        return(a^b);
    }


}
