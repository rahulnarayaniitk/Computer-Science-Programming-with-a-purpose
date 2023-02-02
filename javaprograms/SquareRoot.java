public class SquareRoot {
     public static void main(String[] args)
     {
        double c = Double.parseDouble(args[0]);
        double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON * t)
        {  // Replace t by the average of t and c/t.
           t = (c/t + t) / 2.0;
        }
        System.out.println(t);
     }
}
// public class SquareRoot{
//    public static void main(String args[]){
//       double n=Double.parseDouble(args[0]);
//       double sqrt=0;
//       for(int i=1;i<=n;i++){
//          if(n%i==0&&i*i==n)
//          {
//             sqrt=i;
//          }
//       }
//       System.out.println(sqrt);
//    }
// }
