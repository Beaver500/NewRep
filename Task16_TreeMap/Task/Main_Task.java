package Task16_TreeMap.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main_Task {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/Users/Beaver/Desktop/НЕТОЛОГИЯ.JAVA/patents.csv"));
        scanner.nextLine();
        Map<Integer, Set<Patent>> patents = new TreeMap<>();
        while (scanner.hasNext()) {
            String[] value = scanner.nextLine().split(";");
            Patent patent = new Patent(value[0], value[1], value[2], Integer.parseInt(value[3]), value[4]);

            if (patents.containsKey(patent.getYear())) {
                Set<Patent> setPatents = patents.get(patent.getYear());
                setPatents.add(patent);

            } else {
                Set<Patent> setPatents = new HashSet<>();
                setPatents.add(patent);
                patents.put(patent.getYear(), setPatents);
            }
        }
        for (Map.Entry<Integer, Set<Patent>> patentMapEntry : patents.entrySet()) {
            System.out.println("*** Год " + patentMapEntry.getKey()+" ***");
            for (Patent patent : patentMapEntry.getValue()) {
                System.out.println("    "+patent.toString());
            }
        }
    }
}
