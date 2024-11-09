import java.util.HashMap;
import java.util.Map;

public class Student {

    private HashMap<Integer, String> tenth = new HashMap<>();
    private HashMap<Integer, String> eleventh = new HashMap<>();
    private HashMap<Integer, String> twelfth = new HashMap<>();

    public Student() {
    	
        tenth.put(111, "Ahalya");
        tenth.put(112, "Aakash");
        tenth.put(113, "Aiswarya");
        tenth.put(114, "Abarna");
        tenth.put(115, "Banumathi");
        tenth.put(116, "Bharathi");
        tenth.put(117, "Bala Murali");
        tenth.put(118, "Divya");
        tenth.put(119, "Dhanu sri");
        tenth.put(110, "Divakar");
        tenth.put(121, "Dhanya");
        tenth.put(122, "Gopinath");
        tenth.put(123, "Gowri");
        tenth.put(124, "Hari priya");
        tenth.put(125, "Harini");
        tenth.put(126, "Loga sri");
        tenth.put(127, "Karthika");
        tenth.put(128, "Karunya");
        tenth.put(129, "Kavi priya");
        tenth.put(130, "Mohana priya");

        eleventh.put(211, "Athulya");
        eleventh.put(212, "Arun");
        eleventh.put(213, "Arul");
        eleventh.put(214, "Banu priya");
        eleventh.put(215, "Bharath");
        eleventh.put(216, "Deepika");
        eleventh.put(217, "Dhanush");
        eleventh.put(218, "Hariharan");
        eleventh.put(219, "Harish");
        eleventh.put(210, "Logesh");
        eleventh.put(221, "Karna");
        eleventh.put(222, "Krishna");
        eleventh.put(223, "Kiruthika");
        eleventh.put(224, "Mohan kumar");
        eleventh.put(225, "Nandhan");
        eleventh.put(226, "Narmatha");
        eleventh.put(227, "Pavithra");
        eleventh.put(228, "Praveen");
        eleventh.put(229, "Poovarasan");
        eleventh.put(230, "Varun");

        twelfth.put(311, "Athi");
        twelfth.put(312, "Arthi");
        twelfth.put(313, "Abimanyu");
        twelfth.put(314, "Bharani");
        twelfth.put(315, "Bright Buela");
        twelfth.put(316, "Dharsha");
        twelfth.put(317, "Dharshana");
        twelfth.put(318, "Hariharan");
        twelfth.put(319, "Harsha");
        twelfth.put(310, "Sakthi");
        twelfth.put(321, "Raana");
        twelfth.put(322, "Kavin");
        twelfth.put(323, "Karthick");
        twelfth.put(324, "Kalai Selvan");
        twelfth.put(325, "Neethu");
        twelfth.put(326, "Vetri");
        twelfth.put(327, "Vignesh");
        twelfth.put(328, "Vidhya Shree");
        twelfth.put(329, "Vijay");
        twelfth.put(330, "Vikram");
    }

    public void addStudentToTenth(int id, String name) 
    {
        tenth.put(id, name);
    }

    public void addStudentToEleventh(int id, String name)
    {
        eleventh.put(id, name);
    }

    public void addStudentToTwelfth(int id, String name) 
    {
        twelfth.put(id, name);
    }

    public HashMap<Integer, String> getTenth()
    {
        return tenth;
    }

    public HashMap<Integer, String> getEleventh()
    {
        return eleventh;
    }

    public HashMap<Integer, String> getTwelfth() 
    {
        return twelfth;
    }

    public void printTenthDetails() 
    {
        System.out.printf("%-10s %-2s %-25s\n", "ID", " ", "Name");
        System.out.println("----------------------------");
        
        for (Map.Entry<Integer, String> entry : tenth.entrySet()) 
        {
            System.out.printf("%-10d %-2s %-20s\n", entry.getKey(), "-", entry.getValue());
        }
    }

    public void printEleventhDetails()
    {
        System.out.printf("%-10s %-2s %-25s\n", "ID", " ", "Name");
        System.out.println("----------------------------");
        
        for (Map.Entry<Integer, String> entry : eleventh.entrySet()) 
        {
            System.out.printf("%-10d %-2s %-20s\n", entry.getKey(), "-", entry.getValue());
        }
    }

    public void printTwelfthDetails()
    {
        System.out.printf("%-10s %-2s %-25s\n", "ID", " ", "Name");
        System.out.println("----------------------------");
        
        for (Map.Entry<Integer, String> entry : twelfth.entrySet()) 
        {
            System.out.printf("%-10d %-2s %-20s\n", entry.getKey(), "-", entry.getValue());
        }
    }

    public int getTenthtot()
    {
        return tenth.size();
    }

    public int getEleventhtot()
    {
        return eleventh.size();
    }

    public int getTwelfthtot() {
        return twelfth.size();
    }
}
