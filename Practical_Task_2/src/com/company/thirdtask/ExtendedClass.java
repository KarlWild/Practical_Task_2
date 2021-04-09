package com.company.thirdtask;

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass() {
        b = 1;
        i = 2;
        d = 3;
        s = "4";
    }

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    public byte getB() {
        return b;
    }

    public double getD() {
        return d;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public boolean equals(Object anObject) {
        if (this == anObject) // сравниваем явно два объекта
            return true;
        if (!(anObject instanceof ExtendedClass)) //проверяем, что объект, с которым мы сравниваем является объектом данного класса
            return false;
        ExtendedClass object = (ExtendedClass) anObject;
        //возвращаем сравнение двух объектов по параметрам
        return (getB() == object.getB()) && (getD() == object.getB()) && (getI() == object.getI()) && (getS() == object.getS());
    }

    //генерируем хешкод объекта
    public int hashCode() {
        int code = s == null ? 0 : s.hashCode();
        code = 31 * code + i;
        code = 31 * code + (int) d;
        code = 31 * code + b;
        return code;
    }

    //выводим все параметры объекта
    public String toString() {
        return "i = " + i + "\nb = " + b + "\nd = " + d + "\ns = " + s;
    }
}
