import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入输书名：");
        String bookNmae = sc.nextLine();
        System.out.println("请输入输书类型：");
        String bookType = sc.nextLine();
        System.out.println("请输入输书的价格：");
        float bookPrice = sc.nextFloat();

        computePrice(bookNmae, bookType, bookPrice);
        sc.close();

    }

    private static void computePrice(String bookNmae, String bookType, float bookPrice) {
        if (bookType.equals("新书")) {
            bookPrice = (float) 1.2 * bookPrice;
        } else if (bookType.equals("常规图书")) {
            bookPrice = (float) 1.0 * bookPrice;
        } else if (bookType.equals("旧书")) {
            bookPrice = (float) 0.6 * bookPrice;
        }
        System.out.println("书名：" + bookNmae + "   类型：" + bookType + "  价格：" + bookPrice);
    }

    

}
