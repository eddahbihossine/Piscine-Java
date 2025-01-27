class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        String first = args[0];

        for (int i = 0; i < first.length(); i++) {

            if (Character.isDigit(first.charAt(i))) {
                sum += Integer.parseInt(first.charAt(i) + "");
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }
        System.out.println(sum);
    }
}