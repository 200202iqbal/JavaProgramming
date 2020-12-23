import java.util.List;
import java.util.Optional;

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
    }
}