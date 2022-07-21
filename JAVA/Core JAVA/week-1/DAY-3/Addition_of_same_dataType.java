package DAY_3;

public class Addition_of_same_dataType {
        static void  primitive_numeric_char(){
            char character_1 = 'X' , character_2 = 'Y';
            System.out.println("Character  + character  = " + (character_1+character_2));
        }
        static void primitive_numeric_Integer_byte() {
            byte byte1 = 1, byte2 = 9;
            System.out.println("Byte + Byte = " + (byte1 + byte2));
        }
        static void primitive_numeric_Integer_short() {
            short short1 = 12222, short2 = 3335;
            System.out.println("short + short = " + (short1 + short2));
        }
        static void primitive_numeric_Integer_long() {
            short long1 = 10000, long2 = 15000;
            System.out.println("long + long = " + (long1 + long2));
        }
        static void primitive_numeric_Integer_float() {
            float float1 = 1.34334f, float2 = 5.424234f;
            System.out.println("float + float = " + (float1 + float2));
        }
        static void primitive_numeric_Integer_double() {
            short double1 = 1777, double2 = 5999;
            System.out.println("double + double = " + (double1 + double2));
        }
        // primitive data type boolean does not support Add operation
        static void NON_primitive_numeric_Integer_String () {
            String  String1 = "Devayush ", String2 = "Bajaj";
            System.out.println("String  + double = " + (String1 + String2));
        }

        public static void main(String[]args){

            primitive_numeric_char();
            primitive_numeric_Integer_byte();
            primitive_numeric_Integer_short();
            primitive_numeric_Integer_long();
            primitive_numeric_Integer_float();
            primitive_numeric_Integer_double();
            NON_primitive_numeric_Integer_String ();
        }
}
