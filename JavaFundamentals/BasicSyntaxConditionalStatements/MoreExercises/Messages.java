package FundamentalsModule.BasicSyntaxConditionalStatements.MoreExercises;

import java.util.Scanner;
public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String word = "";
        int letter;
        for(int i=0; i<input; i++){
            letter = Integer.parseInt(scanner.nextLine());

            switch(letter){
                case 2 : word=word+"a";break;
                case 22 : word=word+"b";break;
                case 222 : word=word+"c";break;
                case 3 : word=word+"d";break;
                case 33 : word=word+"e";break;
                case 333 : word=word+"f";break;
                case 4: word=word+"g";break;
                case 44: word=word+"h";break;
                case 444: word=word+"i";break;
                case 5: word=word+"j";break;
                case 55: word=word+"k";break;
                case 555: word=word+"l";break;
                case 6: word=word+"m";break;
                case 66: word=word+"n";break;
                case 666: word=word+"o";break;
                case 7: word=word+"p";break;
                case 77: word=word+"q";break;
                case 777: word=word+"r";break;
                case 7777: word = word+"s";break;
                case 8: word=word+"t";break;
                case 88: word=word+"u";break;
                case 888: word=word+"v";break;
                case 9: word=word+"w";break;
                case 99: word = word+"x";break;
                case 999: word = word+"y";break;
                case 9999: word = word+"z";break;
                case 0: word=word+" ";break;
                default:break;
            }
        }
        System.out.println(word);
    }
}
