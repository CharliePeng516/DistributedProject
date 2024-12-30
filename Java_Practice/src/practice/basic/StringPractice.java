package practice;

public class StringPractice {
    public static void main(String[] args) {
        CheckString();
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:

        String s = ""+ (char)a + (char)b + (char)c;
        System.out.println(s);
    }

    public static void CheckString(){
        String s = "hello";
        String t = s;
        s = "world";
        // t是"hello"还是"world"? 应该是hello 因为 t 的指向任然是“hello”
        System.out.println(t);
    }
}

