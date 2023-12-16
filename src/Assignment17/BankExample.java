package Assignment17;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Bank {
    String accName;
    double sal;
    double tranAmt;

    public Bank(String accName, double sal, double tranAmt) {
        this.accName = accName;
        this.sal = sal;
        this.tranAmt = tranAmt;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accName='" + accName + '\'' +
                ", sal=" + sal +
                ", tranAmt=" + tranAmt +
                '}';
    }
}

public class BankExample {
	
    public static void main(String[] args) {
    	
        Set<Integer> setOfIntegers = new HashSet<>(Arrays.asList(1220, 1330, 1440, 1550, 1660));

        Map<Set<Integer>, Bank> mapOfSetsAndBanks = new HashMap<>();

        // Creating Bank objects and associating them with the sets in the map
        for (int integer : setOfIntegers) {
            Bank bank = new Bank("Account" + integer, 50000.0, 0.0); // Sample data, you can customize this
            mapOfSetsAndBanks.put(Collections.singleton(integer), bank);
        }

        Iterator<Map.Entry<Set<Integer>, Bank>> iterator = mapOfSetsAndBanks.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Set<Integer>, Bank> entry = iterator.next();
            Set<Integer> keySet = entry.getKey();
            Bank bank = entry.getValue();
            System.out.println("Set: " + keySet + ", Bank Object: " + bank);
        }
    }
}