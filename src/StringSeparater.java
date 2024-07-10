public class StringSeparater {
        public static void main (String args[]){
    
            String name = "Vinay0531";
            String res= "";
    
            for(char c :name.toCharArray()){

                if(Character.isDigit(c))
                res += c;

            }
            System.out.println("The String numbers in the name is" + res);
        } 
}
