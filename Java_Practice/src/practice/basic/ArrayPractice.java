package practice.basic;

public class ArrayPractice {
    public static void main(String[] args) {
        CheckArray();
    }

    public static void CheckArray() {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        // Should be "XYZ" the array is changed but the s is point to original place, which is "XYZ"
        for (String name : names) {
            System.out.println(name);
        }
    }
}
