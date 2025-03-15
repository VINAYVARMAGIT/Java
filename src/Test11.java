public class Test11 {
    public static void main(String[] args) {
      String s = "   vinay edh ffnelk kknll     varma  ";
      char[] c = s.toCharArray();
      String n ="";
      boolean first= false;
      for (int i = 0; i < c.length; i++) {
         if(first && (c[i-1]==' ')&&(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')){
            n+=" "+c[i];
            continue;
          }
          if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z'){
            n+=c[i];
            first=true;
            continue;
          }
      } 
      System.out.println(n+" "+ n.length());
    }
}

class ReverseString {

  public static void main(String[] args) {
    String s = "java is easy";
    String n="";
    char [] c=s.toCharArray();
    int i=s.length()-1;
    int j = s.length()-1;
    int k=0;
    while (j>=0) {
      while (j>=0 && c[j]!=' ') {
        j--;
      }
      k=j;
      while (i>k) {
        n+=c[i];
        i--;
      }
      if (i>0) {
        n+=" ";
      }
      //i--;
      j=i;
    }
    System.out.println(n);
  }
}
