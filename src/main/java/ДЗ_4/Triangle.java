package ДЗ_4;

public class Triangle {
    public static int  triangle(int a, int b, int c) throws MyException {
        if (a+b<c || a+c<b || b+c<a) throw new MyException("Ошибка");
        int p = (a+b+c)/2;
        int s = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
