package cz.educanet;

public class MathUtils {



    public static int findGreatestCommonDenominator(int a, int b) {
        int idk;
        while (b != 0) {
            idk = b;
            b = a % b;
            a = idk;
        }
        return a;
    }


        public static int findLowestCommonMultiple (int a, int b){
            int sml = Math.max(a, b);
            int bgr = Math.min(a, b);
            int td = bgr;
            while(td % sml != 0) {
                td += bgr;
            }
            return td;
        }
        }
