package corejavapractice.commonlyused;

import java.util.function.DoubleBinaryOperator;

public class TypeConversionTest {
    public static void main(String[] args) {

        // primitive types
        // narrowing -> needs () brackets to be type casted
        // widening can be directly assigned
        
        // long to int -> narrowing -> needs () brackets to be type casted
        long num1long = 1000000L;
        int num1int = (int) num1long;
        System.out.printf("num1long: %d to num1int: %d \n",num1long,num1int);

        // int to long -> widening can be directly assigned
        int num2int = 2;
        long num2long = num2int;
        System.out.printf("num2long: %d to num2int: %d \n",num2long,num2int);

        // double to int -> narrowing
        double num10double = 10;
        int num10int = (int) num10double;

        // int to double -> widening
        int num9int = 9;
        double num9double = num9int;

        // ----
        // while using wrapper class
        // narrowing --> either use primitive & Boxing or if available use obj.intValue() or obj.longValue()
        // widening --> Class.valueOf()
        // Double to Integer --> narrowing
        Double num12Double = 12.65;
        Integer num12Integer = num12Double.intValue();

        // Double to Long --> narrowing
        Double num15Double = 15.65;
        Long num15Long = num15Double.longValue();

        // Integer to Double / Long --> widening
        Integer num14Integer = 14;
        Double num14Double = Double.valueOf(num14Integer);

        // ----
        // boxing and unboxing doesn't need any () or func, can be directly assigned and is internally handled by Java
        // boxing -> primitive to Class wrapper
        int num3int= 3;
        Integer num3Integer = num3int;

        // unboxing -> Class wrapper to primitive
        Integer num4Integer = 4;
        int num4int=num4Integer;

        // double to Double -> boxing
        double num16double = 106.78;
        Double num16Double = num16double;

        // Double to double -> unboxing
        Double num19Double = 106.78;
        double num19double = num19Double;

        // ----
        // primitive or Class num to String -> String.valueOf() // prefer this as can also be used in method reference

        // int to string
        int num5int = 5;
        String num5String = String.valueOf(num5int);

        Integer num20Integer = 5;
        String num20String = String.valueOf(num20Integer);

        // ----
        // for Class Number to String -> can also use obj.toString() 

        // Integer to String
        Integer num6Integer = 6;
        // String num6String = num6Integer.toString();
        String num6String = Integer.toString(num6Integer);

        // ----
        // String to primitive or Number -> NumberSubClass.parseInt()

        // String to int/Integer
        String num7String = "7";
        int num7int = Integer.parseInt(num7String);
        int num7Integer = Integer.parseInt(num7String);

        // String to long/Long
        String num8String = "8";
        long num8long = Long.parseLong(num8String);
        Long num8Long = Long.parseLong(num8String);

        // String to double/Double
        String num11String = "11";
        double num11double = Double.parseDouble(num11String);
        Double num11Double = Double.parseDouble(num11String);

    }
}

