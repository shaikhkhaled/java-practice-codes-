package pjava;

public class string_arry {
    public static boolean mainarry(String[][]array, String target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < array.length; j++) {
                if (array[i][j].equals(target))
                    return true;
            }
        }
        return false;
    };

    static void main(String[] args) {
        String[][] store = {{},{}};
        String targat = "phone";
        boolean result = mainarry(store, targat);
        if (result) {
            System.out.println("data is true");

        } else {
            System.out.println("data is fol");


        }
    }}