package TexaPoker;

import java.util.Scanner;

public class TexaPoker {

    public static void main(String[] args) {

        Poker black = new Poker();
        Poker white = new Poker();
        Judge judge = new Judge();
        Compare compare = new Compare();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        black.getBlackNumAndProcess(black, str);
        white.getWhiteNumAndProcess(white, str);
        black.getBlackColors(black, str);
        white.getWhiteColors(white, str);
        judge.judgeType(black, str);
        judge.judgeType(white, str);

        System.out.println(compare.isCompareCardSize(black, white));

    }

}
