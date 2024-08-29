public class EncrytionDecryption {
    public static void main(String[] args) {
        String s = "XYZ";
        int n =3;

       System.out.println(encrypt(s,n));
       System.out.println(decrypt(s, n));
    }
    public static String encrypt(String s, int n){

        String en = "";
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                en+= (char)(((((c-'A')%26)+n)+26)%26+'A');
            }else if (Character.isLowerCase(c)) {
                en+= (char)(((((c-'a')%26)+n)+26)%26+'a');
            }else en+=c;
        }
        return en;
    }
    public static String decrypt(String s, int n){
        return encrypt(s, -n);
    }
}
