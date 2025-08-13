public class Text {


    static boolean reverse(String s,int right,int left) {

         if(left>=right) return true ;
         if(s.charAt(left)==s.charAt(right)) {

             return reverse(s,right-1,left+1) ;
         }

         return false ;

    }
    public static void main(String... args) {

        String name =  "abccba" ;
        int right =  name.length()- 1 ;
        int left =0 ;


        System.out.println(reverse(name,right,left)) ;
    }

}
