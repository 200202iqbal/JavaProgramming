import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import jakarta.xml.bind.DatatypeConverter;

public class Encryption
{
  public static void main(String[]args) throws NoSuchAlgorithmException,UnsupportedEncodingException
  {
    //ハッシュを生成したい元の文字列
    String source = "bale";
    //ハッシュ生成前にバイト配列に置き換えるの際のエンコーデｲング
    String encoding = "UTF-8";
    //ハッシュアルゴリズム
    String algorithm = "SHA-512";

    byte[] bytes = MessageDigest.getInstance(algorithm).digest(source.getBytes(encoding));
    String result = DatatypeConverter.printHexBinary(bytes);
    //準備出力
    System.out.format("生成結果=%1$s", result);
  }
}
