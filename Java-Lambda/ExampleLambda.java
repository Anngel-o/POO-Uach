public class ExampleLambda {
    public static void main(String[] args) {
        int res;
        Operation multi = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;

        res = multi.op(8, 4);
        System.out.println("La multiplicación de la función lambda es " + res);
        res = div.op(8, 4);
        System.out.println("La división de la función lambda es " + res);
        res = add.op(8, 4);
        System.out.println("La suma de la función lambda es " + res);
        res = sub.op(8, 4);
        System.out.println("La resta de la función lambda es " + res);
    }
}

interface Operation {
    int op(int a, int b);
}
