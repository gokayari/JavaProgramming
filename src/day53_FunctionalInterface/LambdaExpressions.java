package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                word -> {
                    String reverse = new StringBuilder(word).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        MyThirdFunctionalInterface<Integer> cube = (n) -> {
            int cubeVolume = n*n*n;
            return cubeVolume;
        };

        System.out.println(cube.method(3));

    }
}
