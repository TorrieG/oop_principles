package abstraction.abstraction_classes;

import java.util.ArrayList;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        create
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        int c = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensive = null;
        for (Phone phone : phones) {
            System.out.println(phone);
            if (phone.price > max){
               mostExpensive = phone;
            }if (phone.isConvertible()) c++;
        }
        System.out.println("The most expensive phone is = "+mostExpensive.getClass().getSimpleName());
        System.out.println(c);

        System.out.println(IPhone.OS);
    }
}
