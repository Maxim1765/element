import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        alfavit = new String(alfavit.toCharArray());
        System.out.println("привет это программа для расшифровки кода цезаря.");
        System.out.println("введи текст который хочешь раскодировать.");
        String zapis = scanner.nextLine();

        for (int key = 0; key < 33 ; key++) {
            String encryptedString = "";
            for (int i = 0; i < zapis.length(); i++) {
                char currentSymbol = zapis.charAt(i);
                int foundIndex = alfavit.indexOf(currentSymbol);

                if (foundIndex != -1) {
                    int newIndex = (foundIndex + key) % alfavit.length();
                    encryptedString += alfavit.charAt(newIndex);
                } else {
                    encryptedString += currentSymbol;
                }
            }

            System.out.println("зашифрованный текст = " + encryptedString);
        }










            

    }
}
