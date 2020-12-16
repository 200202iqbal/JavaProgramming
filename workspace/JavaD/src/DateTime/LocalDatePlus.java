package DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDatePlus
{
  public static void main(String[] args)
  {
    //Menampilkan waktu sekarang
    LocalDateTime today = LocalDateTime.now();
    System.out.println(today);

    //Melihat zona waktu yang tersedia
    //Set zids = ZoneId.getAvailableZoneIds();
    //System.out.println(zids);

    //Melihat waktu berdasarkan zona waktu yang diinginkan
    ZoneId zi = ZoneId.of("Asia/Jakarta");
    ZonedDateTime zdtJKT = ZonedDateTime.now(zi);
    System.out.println(zdtJKT);
        
  }
}
