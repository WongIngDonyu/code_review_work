public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
    return a-b;
    }
    public int div(int a, int b)throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на нуль");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        System.out.println("Решим задачу умножения 6 на 4");
        return times(6,4);
    }
}
