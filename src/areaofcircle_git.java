public class areaofcircle_git {

        static double pi = 3.14;
        static void circ(double r)
        {
            double area = pi*(r*r);
            System.out.println("The area of the circle for radius "+ r +" is "+ area +".");
        }
        public static void main(String[] args)
        {
            circ(2.5);
        }



}
