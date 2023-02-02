//METHOD 1:

// public class Binary {
//     public static void main(String[] args){
//         int n= Integer.parseInt(args[0]);

//         int power=1;

//         //set power to the largest power of 2 <=n
//         while(power<=n/2){
//             power*=2;
//         }
//         //check for presence of the powers of 2 in n from largest to smallest
//         while(power>0)
//         {
//             //power is not present in n
//             if(n<power)
//             {
//                 System.out.print(0);
//             }
//             //power is present in n, so subtract power from n
//             else{
//                 System.out.print(1);
//                 n-=power;
//             }
//             //next smallest power of 2
//             power/=2;
//         }
//         System.out.println();
//     }    
// }

//METHOD 2:
public class Binary {
    public static void main(String[] args){
        int n= Integer.parseInt(args[0]);
        int r,binary=0,p=1;
        while(n!=0)
        {
            r=n%2;
            binary+=r*p;
            p*=10;
            n=n/2;
        }
        System.out.println(binary);
    }
}
