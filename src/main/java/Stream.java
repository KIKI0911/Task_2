import java.util.List;

public class Stream {
    public static void main(String[] args){
    List<String>list = List.of("aichi","kyoto","tokyo","osaka");
    list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
