import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamPCMain
{
    public static void main(String[] args)
    {
        List <StreamPC> list = StreamPC.getList();

        list.forEach(System.out::println);
        System.out.println();
        list.stream().filter(a -> a.getPrice() >= 70000).forEach(System.out::println);
        System.out.println();
        Optional<String>names = list.stream().map(StreamPC::getName).reduce((a,b) -> a + " , " + b);
        System.out.println(names.get());
        System.out.println();

        OptionalInt max = list.stream().mapToInt(StreamPC::getPrice).max();
        OptionalInt min = list.stream().mapToInt(StreamPC::getPrice).min();

        System.out.println("最大 : " + max.getAsInt());
        System.out.println("最小 : " + min.getAsInt());

        System.out.println();
        long cnt = list.stream().count();
        System.out.println(cnt);

        System.out.println();
        int total = list.stream().mapToInt(StreamPC::getPrice).sum();
        System.out.println(total);
    }
}