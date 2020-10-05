import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    final private String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]l*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
        // không có constructor, sử dụng phương thức static compile(String) để tạo đối tượng.
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        // Lớp này không có constructor, sử dụng phương thức
        //matcher(String) của đối tượng Pattern để tạo đối tượng
        return matcher.matches();
    }

}