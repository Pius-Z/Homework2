package TexaPoker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    static String str = "Black: TH JH QH KH AH White: TH JH QH KH AH";

    /*
    @Test
    void testBIsRoyalStraightFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 10;
        int actual = judge.BIsRoyalStraightFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsRoyalStraightFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 10;
        int actual = judge.WIsRoyalStraightFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsStraightFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 9;
        int actual = judge.BIsStraightFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsStraightFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 9;
        int actual = judge.WIsStraightFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsFour() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 8;
        int actual = judge.BIsFour(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsFour() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 8;
        int actual = judge.WIsFour(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsGourd() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 7;
        int actual = judge.BIsGourd(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsGourd() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 7;
        int actual = judge.WIsGourd(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 6;
        int actual = judge.BIsFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsFlush() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 6;
        int actual = judge.WIsFlush(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsStraight() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 5;
        int actual = judge.BIsStraight(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsStraight() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 5;
        int actual = judge.WIsStraight(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsThree() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 4;
        int actual = judge.BIsThree(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsThree() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 4;
        int actual = judge.WIsThree(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsTwoPairs() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 3;
        int actual = judge.BIsTwoPairs(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsTwoPairs() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 3;
        int actual = judge.WIsTwoPairs(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsOnePairs() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 2;
        int actual = judge.BIsOnePairs(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsOnePairs() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 2;
        int actual = judge.WIsOnePairs(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testBIsHighCard() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 1;
        int actual = judge.BIsHighCard(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testWIsHighCard() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 1;
        int actual = judge.WIsHighCard(poker, str);
        assertEquals(expect, actual);
    }

     */
    @Test
    void testJudgeBType() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getBlackNumAndProcess(poker, str);
        poker.getBlackColors(poker, str);
        int expect = 10;
        int actual = judge.judgeBType(poker, str);
        assertEquals(expect, actual);
    }

    @Test
    void testJudgeWType() {
        Poker poker = new Poker();
        Judge judge = new Judge();
        poker.getWhiteNumAndProcess(poker, str);
        poker.getWhiteColors(poker, str);
        int expect = 10;
        int actual = judge.judgeWType(poker, str);
        assertEquals(expect, actual);
    }
}