import java.util.List;

public class Stream {
    public static void main(String[] args){
    List<String>lists = List.of("aichi","kyoto","tokyo","osaka");
    lists.stream().map(String::toUpperCase).forEach(System.out::println);

    List<String>names = List.of("suzuki","tanaka","tamura", "konishi");
    List<String>sortedResult = names.stream().sorted().toList();

    long count = names.stream().map(String::toUpperCase).filter(name -> name.startsWith("T")).count();
    boolean hasTanaka = names.stream().anyMatch(name -> name.equals("tamura"));
    System.out.println(count);
    System.out.println(hasTanaka);
    }
}
