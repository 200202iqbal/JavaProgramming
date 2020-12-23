import java.util.List;
public class StreamS3
{
    public static void main(String[] args)
    {
        List<StreamPC> list = StreamPC.getList();
        list.forEach(System.out::println);
        System.out.println();

        long num = list.stream().filter(a -> a.getType().equals("DESKTOP")).count();
        System.out.println(num);
    }
}