package TexaPoker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    static String str = "Black: 2D 2H 4S 7C 6S White: 2S 4D 6S 8H TS";

    /*
    测试用例
    题目所给测试用例(按照标准规则进行判断）
    Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH 输出: White wins 牌型(1-1)
    Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S 输出: Black wins 牌型(7-6)
    Black: 2H 3H 5H 9H KH White: 2C 3H 4S 5C 6H 输出: Black wins 牌型(6-5)
    Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH 输出: Tie 牌型(1-1)
    自己写的测试用例
    Black: TC JC QC AC KC White: 2S 3S 6S 4S 5S 输出: Black wins 牌型(10-9)
    Black: 6C 8C 6D 8C 6H White: 2D 2H 2S 2C 5S 输出: White wins 牌型(7-8)
    Black: 2S 4S 6S 9S 5S White: 2D 3H 4S 5C 6S 输出: Black wins 牌型(6-5)
    Black: 2D 2H 4S 6C 6S White: 2S 2D 2S 9H 5S 输出: White wins 牌型(3-4)
    Black: 2D 2H 4S 7C 6S White: 2S 4D 6S 8H TS 输出: Black wins 牌型(2-1)
    Black: TC JC QC AC KC White: TC JC QC AC KC 输出: Tie 牌型(10-10)
    Black: 7C JC TC 9C 8C White: 2S 3S 6S 4S 5S 输出: Black wins 牌型(9-9)
    Black: 7C 1C 3C TC 8C White: 2S TS 9S 4S 5S 输出: White wins 牌型(6-6)
    Black: 7H 7C 3D TC 7S White: 8S 5C 8H 4S 8D 输出: White wins 牌型(4-4)
    Black: 2D 2H 4S 6C 6S White: 6S 4C 2H 6S 2D 输出: Tie 牌型(3-3)
     */
    @Test
    void testCompareCardSize() {
        Poker black = new Poker();
        Poker white = new Poker();
        Judge judge = new Judge();
        Compare compare = new Compare();

        black.getBlackNumAndProcess(black, str);
        white.getWhiteNumAndProcess(white, str);
        black.getBlackColors(black, str);
        white.getWhiteColors(white, str);
        judge.judgeType(black, str);
        judge.judgeType(white, str);
        String expect = "Black wins";
        String actual = compare.isCompareCardSize(black, white);
        assertEquals(expect, actual);
    }

}