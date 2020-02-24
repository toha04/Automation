public class VarargsFormat {
    public static void main(String[] args) {
        String siteName = "intern.biz";
        int value = 10;
        String type = "business";
        System.out.println(String.format("Site name : %s, Value : %s, Type : %s", siteName, value, type));
    }
}
