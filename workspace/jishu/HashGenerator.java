import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class HashGenerator{
	public static void main(String[]args) throws NoSuchAlgorithmException,UnsupportedEncodingException{
		String source = "タロウ";
		String encoding = "UTF-8";
		String algorithm = "MD5";

		byte[] bytes = MessageDigest.getInstance(algorithm).digest(source.getBytes(encoding));
		String result = DatatypeConverter.printHexBinary(bytes);

		System.out.format("生成結果=%1$s",result);
	}
}