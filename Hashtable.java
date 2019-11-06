public class Hashtable {

    public static void main(String[] args) {
    
        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
        h1.put(3, "Geeks");
        h1.put(2, "forGeeks");
        h1.put(1, "isBest");

        // create a clone or shallow copy of hash table h
        h2 = (Hashtable<Integer, String>) h1.clone();

        // checking clone h1
        System.out.println("values in clone: " + h2);

        // clear hash table h
        // h1.clear();

        // checking hash table h
        System.out.println("after clearing: " + h1);

        // provide value for new key which is absent
        // using computeIfAbsent method
        h1.computeIfAbsent(6, k -> "Good");
        h1.computeIfAbsent(1, k -> "newBook");

        // print new mapping
        System.out.println("new hashTable: "
                + h1);

        System.out.println(h1.containsKey(1));
        System.out.println(h1.containsValue("Good"));

        // create enumeration
        Enumeration e = h1.elements();

        System.out.println("display values:");

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // creating set view for hash table
        Set s = h1.entrySet();

        // printing set entries
        System.out.println("set entries: " + s);

        System.out.println(h1.get(1));
    
    }
