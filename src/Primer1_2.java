public class Primer1_2 {
    public static void main(String[] args) {
        try {
            InputStream inUrl = new URL("http://google.com").openStream();
            Primer1.readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}