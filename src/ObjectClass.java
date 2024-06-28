
class Biscuit{
    String name ;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Biscuit other = (Biscuit) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }



//  boolean toString(Biscuit that){

//     return this.name.equals(that.name) && this.price==that.price;
//  }

}


 class ObjectClass {
  public static void main(String[] args) {
    

    Biscuit b1 = new Biscuit();
    b1.name = "parleG";
    b1.price = 10;

    Biscuit b2 = new Biscuit();
    b2.name = "parleG";
    b2.price = 10;

    System.out.println(b1.equals(b2));

  }
}
