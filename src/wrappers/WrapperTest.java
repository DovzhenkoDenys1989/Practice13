package wrappers;

public class WrapperTest {

    public static void main(String[] args) {

        Byte b1 = 1;
        Byte b2 = Byte.valueOf((byte) 1);
        Byte b3 = new Byte((byte) 1);
        Byte b4 = Byte.parseByte("1");

        Short s1 = 10;
        Short s2 = Short.valueOf((short) 10);
        Short s3 = new Short((short) 10);
        Short s4 = Short.parseShort("10");

        Integer i1 = 100;
        Integer i2 = Integer.valueOf(100);
        Integer i3 = new Integer(100);
        Integer i4 = Integer.parseInt("100");

        Long l1 = 1000L;
        Long l2 = Long.valueOf(1000L);
        Long l3 = new Long(1000L);
        Long l4 = Long.parseLong("1000");

        Float f1 = 3.14f;
        Float f2 = Float.valueOf(3.14f);
        Float f3 = new Float(3.14f);
        Float f4 = Float.parseFloat("3.14");

        Double d1 = 3.1414;
        Double d2 = Double.valueOf(3.1414);
        Double d3 = new Double(3.1414);
        Double d4 = Double.parseDouble("3.1414");

        Character ch1 = 'c';
        Character ch2 = Character.valueOf('c');
        Character ch3 = new Character('c');

        Boolean bl1 = true;
        Boolean bl2 = Boolean.valueOf(true);
        Boolean bl3 = new Boolean(true);
        Boolean bl4 = Boolean.parseBoolean("true");


        Double d01 = 55.55;
        byte b01 = d01.byteValue();
        short s01 = d01.shortValue();
        int i01 = d01.intValue();
        float f01 = d01.floatValue();
        long l01 = d01.longValue();


        Double d001 = 50.5;
        Double d002 = 0.0;
        Double nanValue = d001 / d002;
        Double infinityValue = d002 / d002;
        System.out.println(nanValue);
        System.out.println(infinityValue);

        boolean res1 = nanValue.isNaN();
        if (res1)
            System.out.println("Переменная " + nanValue + " = NaN");
        else
            System.out.println("Переменная " + nanValue + " = Infinity");
        nanValue.isInfinite();
        if (res1)
            System.out.println("Переменная " + nanValue + " = NaN");
        else
            System.out.println("Переменная " + nanValue + " = Infinity");

        boolean res2 = infinityValue.isNaN();
        if (res2)
            System.out.println("Переменная " + infinityValue + " = NaN");
        else
            System.out.println("Переменная " + infinityValue + " = Infinity");
        infinityValue.isInfinite();
        if (res2)
            System.out.println("Переменная " + infinityValue + " = NaN");
        else
            System.out.println("Переменная " + infinityValue + " = Infinity");


//      Long l001 = 120L;
//      Long l002 = 120L;
        Long l001 = 1200L;
        Long l002 = 1200L;
        System.out.println(l001 == l002);
    }
}
//        1 Создать пакет wrappers в своем проекте, дальнейшая работа будет вестись в нем.
//        2 Создать класс WrapperTest, с main методом
//        2.1 Для каждого типа данных создать по 4 переменные и проинициализировать разными
//        вариантами:
//        • Из примитива, используя автоупаковку
//        • С помощью метода valueOf
//        • С помощью new
//        • Распарсить значение из строки
//        3 Создать переменную типа Double присвоить ей значение с дробнойчастью.
//        3.1 Создать переменный примитивных типов (byte, short, int, float, long )
//        3.2 Преобразовать и присвоить значение Double каждому из примитивных типов
//        используя специальные методы или автораспаковку.
//        4 Проверить значения NaN и Infinity.
//        4.1 Создать 2 переменные типа Double, одной из них присвоить значение 0.0.
//        4.2 Создать переменную типа Double nanValue и присвоить ей значение, деления
//        ненулевой переменной на нулевую.
//        4.3 Создать переменную infinityValue и присвоить ей значение, деления нулевой
//        переменной саму на себя.
//        4.4 Вывести nanValue и infinityValue на экран.
//        4.5 Добавить по 2 блока if для каждого числа в которых проверяется результат
//        выполнения методов isNaN и isInfinity.
//        Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
//        Если число Infinityвывести текст «Переменная {{имя переменной}} = Infinity»
//        5 Создать 2 переменной типа Long присвоить обеим значения 120
//        5.1 Вывести на экран результат сравнения этих переменных по оператору ==.
//        5.2 Заменить значения переменных на 1200, перепроверить сравнение.