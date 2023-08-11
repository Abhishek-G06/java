public class Stream {
    public static void main(String[] args) {
        //skip("","bacapplecdad");
        System.out.println(skipC("bacapplecdad"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skipC( String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipC(up.substring(5));
        }else{
            return up.charAt(0) + skipC(up.substring(1));
        }
    }
}
