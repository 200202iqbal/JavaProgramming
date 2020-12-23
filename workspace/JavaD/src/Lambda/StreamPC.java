import java.util.Arrays;
import java.util.List;

public class StreamPC implements Comparable
{
    private String name;
    private String type;
    private int price;
    private String maker;

    StreamPC(String name, String type, int price, String maker)
    {
        this.name = name;
        this.type = type;
        this.price = price;
        this.maker = maker;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return this.price;
    }

    public void setMaker(String maker)
    {
        this.maker = maker;
    }
    public String getMaker()
    {
        return this.maker;
    }

    @Override
    public int compareTo(Object o)
    {
        return this.name.compareTo(((StreamPC) o).name);
    }

    @Override
    public String toString()
    {
        return "PC { name " + this.name + " type = " + this.type + 
        " price = " + this.price + " maker = " + this.maker + " } "; 
    }

    public static List<StreamPC> getList()
    {
        List<StreamPC> list = Arrays.asList
        (
            new StreamPC("DELO-200","DESKTOP",50000,"DELLO"),
            new StreamPC("HQ-110A","DESKTOP",68000,"HQ"),
            new StreamPC("PanaMini", "TABLET",62000,"Panan"),
            new StreamPC("SeakBook","LAPTOP",98000,"HQ"),
            new StreamPC("Panalet", "LAPTOP",75000,"Panan"),
            new StreamPC("HQ-Star", "DESKTOP",60000,"HQ"),
            new StreamPC("LatteAir","LAPTOP",85000,"Latte"),
            new StreamPC("Nectop","LAPTOP",79000,"Nect"),
            new StreamPC("DELOPad", "TABLET", 48000,"DELO"),
            new StreamPC("DELO-100","DESKTOP",48000,"DELO"),
            new StreamPC("Ariban","TABLET",12000,"Ariban"));
            return list;
    }
}