package Java11;

import java.util.stream.Collectors;

public class StringLinesExemplo {
    public static void main(String[] args) {
        String html = "<html><head>\n\n\n</head>\n<body>\n\n\n</body>\n</html>";
        System.out.println(html.lines().filter(s -> s.contains("head")).collect(Collectors.joining()));
    }
}
