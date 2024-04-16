public class start {
    public static void main(String[] args) {
        //to add another string at the preexisting string of stringbuilder or stringbuffer we do
       
        String brand =" soumyadip";
        System.out.println(brand);
        brand.concat("bangalore");
        System.out.println(brand);
        StringBuilder t=new StringBuilder("soch");
        System.out.println(t);
        t.append("satya");// append method is used to concat string  in string builder
        System.out.println(t);
    }
}
