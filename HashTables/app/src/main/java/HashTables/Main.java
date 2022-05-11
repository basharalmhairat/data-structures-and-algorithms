package HashTables;

public class Main {
        public static void main(String[] args) {


            Hashtable<String> hashTable = new Hashtable<String>(1000);



            hashTable.add("mea","ning");
            hashTable.add("o","rgnized");
            hashTable.add("l","ol");
            hashTable.add("K","roos");
            hashTable.add("h","ello");
            hashTable.add("m","ain");
            hashTable.add("d","oll");

            System.out.println(  hashTable.contains("k") );
            System.out.println(  hashTable.contains("K") );
            System.out.println(  hashTable.get("o") );
            System.out.println(  hashTable.get("p") );

            System.out.println(hashTable);
        }
    }


