public class GreatCircle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double r = 6371.0;
        double x1 = Math.toRadians(a);
        double y1 = Math.toRadians(b);
        double x2 = Math.toRadians(c);
        double y2 = Math.toRadians(d);
        

        double m = Math.asin(Math.sqrt(Math.sin((x2-x1)/2)*Math.sin((x2-x1)/2)+(Math.cos(x1)*Math.cos(x2))*Math.sin((y2-y1)/2)*Math.sin((y2-y1)/2)));

        double distance = 2*r*m;
        System.out.println(distance+" kilometers");

    }
    
}
