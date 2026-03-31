import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String ext = file.substring(file.lastIndexOf(".")+1);
        System.out.println("Extension: " + ext);
    }
}
