import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HocSinhDAO {
    private static final String FILE_NAME = "HocSinh.txt";

    public void write(List<HocSinh> s) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

    }

    public List<HocSinh> read() {
        List<HocSinh> al = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);
            al = (List<HocSinh>) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.print("List is empty");
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return al;
    }

    private void closeStream(InputStream is) {
        if (is != null)
            try {
                is.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
    }
}
