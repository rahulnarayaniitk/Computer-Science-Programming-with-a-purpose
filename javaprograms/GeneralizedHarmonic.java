public class GeneralizedHarmonic {
        public static void main(String[] args) {
    
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);
            
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                for(int j=1;j<r;j++){
                    i*=i;
                }
                sum += (1.0 / i);
            }
    
        
            System.out.println(sum);
        }
    
    }

