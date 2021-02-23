package decorator.implement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author I-Chung, Wang
 * @date 2021/2/18 下午 09:07
 */
public class LowerCaseInputStream extends FileInputStream {
    public LowerCaseInputStream(InputStream inputStream) throws FileNotFoundException {
        super(String.valueOf(inputStream));
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i<offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
