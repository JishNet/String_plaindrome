public class Main {


    static boolean reverse(String s,int l) {

        if(l==0) return true ;
        if(s.charAt(0)==s.charAt(l)) {
            l--;
            return reverse(s.substring(1),l-1) ;
        }

        return false ;

    }
    public static void main(String... args) {

        String name =  "123454321" ;
        int l =  name.length()- 1 ;


        System.out.println(reverse(name,l)) ;
    }

}
