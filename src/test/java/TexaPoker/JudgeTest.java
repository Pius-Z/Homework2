package TexaPoker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    static String str = "Black: TC JC QC KC AC White: 2S 3S 6S 4S 5S";

    /*
    测试用例
    10-9 Black: TC JC QC AC KC White: 2S 3S 6S 4S 5S
    7-8 Black: 6C 8C 6D 8C 6H White: 2D 2H 2S 2C 5S
    6-5 Black: 2S 4S 6S 9S 5S White: 2D 3H 4S 5C 6S
    3-4 Black: 2D 2H 4S 6C 6S White: 2S 2D 2S 9H 5S
    2-1 Black: 2D 2H 4S 7C 6S White: 2S 4D 6S 8H TS
     */

    /*
    @Test
    void testBlackIsRoyalStraightFlush() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 10;
        int actual = judge.isRoyalStraightFlush(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsRoyalStraightFlush() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 10;
        int actual = judge.isRoyalStraightFlush(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsStraightFlush() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 9;
        int actual = judge.isStraightFlush(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsStraightFlush() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 9;
        int actual = judge.isStraightFlush(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsFour() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 8;
        int actual = judge.isFour(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsFour() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 8;
        int actual = judge.isFour(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsGourd() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 7;
        int actual = judge.isGourd(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsGourd() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 7;
        int actual = judge.isGourd(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsFlush() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 6;
        int actual = judge.isFlush(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsFlush() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 6;
        int actual = judge.isFlush(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsStraight() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getBlackNumAndProcess(white, str);
        white.getBlackColors(white, str);
        int expect = 5;
        int actual = judge.isStraight(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsStraight() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 5;
        int actual = judge.isStraight(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsThree() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 4;
        int actual = judge.isThree(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsThree() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 4;
        int actual = judge.isThree(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsTwoPairs() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 3;
        int actual = judge.isTwoPairs(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsTwoPairs() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 3;
        int actual = judge.isTwoPairs(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsOnePairs() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 2;
        int actual = judge.isOnePairs(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsOnePairs() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 2;
        int actual = judge.isOnePairs(white, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBlackIsHighCard() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 1;
        int actual = judge.isHighCard(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWhiteIsHighCard() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 1;
        int actual = judge.isHighCard(white, str);
        assertEquals(expect, actual);
    }
     */

    @Test
    void testJudgeBlackType() {
        Poker black = new Poker();
        Judge judge = new Judge();
        black.getBlackNumAndProcess(black, str);
        black.getBlackColors(black, str);
        int expect = 10;
        int actual = judge.judgeType(black, str);
        assertEquals(expect, actual);
    }

    @Test
    void testJudgeWhiteType() {
        Poker white = new Poker();
        Judge judge = new Judge();
        white.getWhiteNumAndProcess(white, str);
        white.getWhiteColors(white, str);
        int expect = 9;
        int actual = judge.judgeType(white, str);
        assertEquals(expect, actual);
    }
}