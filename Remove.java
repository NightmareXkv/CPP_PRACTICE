public class Remove {
    public static void main(String[] args) {
        String str = "Hello World Java";
        char[] arr = str.toCharArray();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                arr[index++] = arr[i];
            }
        }

        String result = new String(arr, 0, index);
        System.out.println(result);
    }
}

