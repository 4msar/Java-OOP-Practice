//Q: Write a Java Program using overloading method where methods name will be as like sum
// (int, float, double), sum(float, double) and sum(). Among these methods third method
// will return a string which string will be printed from sum() method and others methods
// will return their output from main methods.

class Question2 {
    public static void main(String[] args) {
        CustomMath math = new CustomMath();
        System.out.println(math.sum(4, 3, 8.3535));
        System.out.println(math.sum(3, 8.3535));
        math.sum();
    }
}

class CustomMath {
    double sum(int first, float second, double third) {
        return first + second + third;
    }

    double sum(float first, double second) {
        return first + second;
    }

    String sum() {
        String msg = "Welcome to Custom Math";
        System.out.println(msg);
        return msg;
    }
}