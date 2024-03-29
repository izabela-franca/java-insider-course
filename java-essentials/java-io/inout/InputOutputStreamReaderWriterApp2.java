package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class InputOutputStreamReaderWriterApp2 {

    private static final byte[] BYTES= {
        106, 97, 118,97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47
    };

    public static void main(String[] args) throws IOException {

        String text;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8))) {
            text = reader.readLine();
        }
        System.out.println(text);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(OutputStreamWriter out = new OutputStreamWriter(baos)) {
            out.write(text);
        }
        byte[] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(BYTES));
        System.out.println(Arrays.toString(bytes));
    }
}
