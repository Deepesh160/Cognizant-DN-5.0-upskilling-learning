import java.nio.file.*; public class FileReadDemo{public static void main(String[]a)throws Exception{System.out.println(Files.readString(Path.of("output.txt")));}}
