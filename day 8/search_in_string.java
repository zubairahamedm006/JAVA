package Day08;

public class search_in_string {
    public static void main(String[] args) {
        String name = "hello world";
        char[] name1 = name.toCharArray();
        char target = 'l';
        if (ls(name1, target)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    static boolean ls(char[] name1, char target) {
        for (char value : name1) {
            if (value== target) {
                return true;

            }
        }
        return false;
    }
}