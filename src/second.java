public class second {
        public static void main(String[] args) {
            int number = 58;

            int tens = number / 10;
            int ones = number % 10;

            int sum = tens + ones;

            System.out.println("Сума цифр двозначного числа " + number + " дорівнює " + sum);
        }

}
