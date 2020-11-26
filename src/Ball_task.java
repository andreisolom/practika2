public class Ball_task {
    {
        public static void main (String[]args)
        {
            Ball b1 = new Ball("black ", "basketball", 5);
            Ball b2 = new Ball("white ", "football", 4);
            Ball b3 = new Ball("brown ", "volleyball", 7);
            b3.setRadius(1);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println();

        }
    }
}