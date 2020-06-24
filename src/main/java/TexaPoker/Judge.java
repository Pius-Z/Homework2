package TexaPoker;

import java.util.Arrays;

public class Judge {

    public int BIsRoyalStraightFlush(Poker poker, String str) {
        if (poker.Bcol[0] == poker.Bcol[1] &&
                poker.Bcol[0] == poker.Bcol[2] &&
                poker.Bcol[0] == poker.Bcol[3] &&
                poker.Bcol[0] == poker.Bcol[4] &&
                poker.Bnum[1] - poker.Bnum[0] == 1 &&
                poker.Bnum[2] - poker.Bnum[1] == 1 &&
                poker.Bnum[3] - poker.Bnum[2] == 1 &&
                poker.Bnum[4] - poker.Bnum[3] == 1 &&
                poker.Bnum[4] == 14)
            poker.Blevel = 10;
        return poker.Blevel;
    }

    public int WIsRoyalStraightFlush(Poker poker, String str) {
        if (poker.Wcol[0] == poker.Wcol[1] &&
                poker.Wcol[0] == poker.Wcol[2] &&
                poker.Wcol[0] == poker.Wcol[3] &&
                poker.Wcol[0] == poker.Wcol[4] &&
                poker.Wnum[1] - poker.Wnum[0] == 1 &&
                poker.Wnum[2] - poker.Wnum[1] == 1 &&
                poker.Wnum[3] - poker.Wnum[2] == 1 &&
                poker.Wnum[4] - poker.Wnum[3] == 1 &&
                poker.Wnum[4] == 14)
            poker.Wlevel = 10;
        return poker.Wlevel;
    }

    public int BIsStraightFlush(Poker poker, String str) {
        if (poker.Bcol[0] == poker.Bcol[1] &&
                poker.Bcol[0] == poker.Bcol[2] &&
                poker.Bcol[0] == poker.Bcol[3] &&
                poker.Bcol[0] == poker.Bcol[4] &&
                poker.Bnum[1] - poker.Bnum[0] == 1 &&
                poker.Bnum[2] - poker.Bnum[1] == 1 &&
                poker.Bnum[3] - poker.Bnum[2] == 1 &&
                poker.Bnum[4] - poker.Bnum[3] == 1)
            poker.Blevel = 9;
        return poker.Blevel;
    }

    public int WIsStraightFlush(Poker poker, String str) {
        if (poker.Wcol[0] == poker.Wcol[1] &&
                poker.Wcol[0] == poker.Wcol[2] &&
                poker.Wcol[0] == poker.Wcol[3] &&
                poker.Wcol[0] == poker.Wcol[4] &&
                poker.Wnum[1] - poker.Wnum[0] == 1 &&
                poker.Wnum[2] - poker.Wnum[1] == 1 &&
                poker.Wnum[3] - poker.Wnum[2] == 1 &&
                poker.Wnum[4] - poker.Wnum[3] == 1)
            poker.Wlevel = 9;
        return poker.Wlevel;
    }

    public int BIsFour(Poker poker, String str) {
        if ((poker.Bnum[0] == poker.Bnum[1] &&
                poker.Bnum[0] == poker.Bnum[2] &&
                poker.Bnum[0] == poker.Bnum[3] )||(
                poker.Bnum[1] == poker.Bnum[2] &&
                poker.Bnum[1] == poker.Bnum[3] &&
                poker.Bnum[1] == poker.Bnum[4]))
            poker.Blevel = 8;
        return poker.Blevel;
    }

    public int WIsFour(Poker poker, String str) {
        if ((poker.Wnum[0] == poker.Wnum[1] &&
                poker.Wnum[0] == poker.Wnum[2] &&
                poker.Wnum[0] == poker.Wnum[3] )||(
                poker.Wnum[1] == poker.Wnum[2] &&
                poker.Wnum[1] == poker.Wnum[3] &&
                poker.Wnum[1] == poker.Wnum[4]))
            poker.Wlevel = 8;
        return poker.Wlevel;
    }

    public int BIsGourd(Poker poker, String str) {
        if (((poker.Bnum[0] == poker.Bnum[1] &&
                poker.Bnum[0] == poker.Bnum[2] )&&(
                poker.Bnum[3] == poker.Bnum[4] ))||((
                poker.Bnum[0] == poker.Bnum[1] )&&(
                poker.Bnum[2] == poker.Bnum[3] &&
                poker.Bnum[3] == poker.Bnum[4])))
            poker.Blevel = 7;
        return poker.Blevel;
    }

    public int WIsGourd(Poker poker, String str) {
        if (((poker.Wnum[0] == poker.Wnum[1] &&
                poker.Wnum[0] == poker.Wnum[2] )&&(
                poker.Wnum[3] == poker.Wnum[4] ))||((
                poker.Wnum[0] == poker.Wnum[1] )&&(
                poker.Wnum[2] == poker.Wnum[3] &&
                poker.Wnum[3] == poker.Wnum[4])))
            poker.Wlevel = 7;
        return poker.Wlevel;
    }

    public int BIsFlush(Poker poker, String str) {
        if (poker.Bcol[0] == poker.Bcol[1] &&
                poker.Bcol[0] == poker.Bcol[2] &&
                poker.Bcol[0] == poker.Bcol[3] &&
                poker.Bcol[0] == poker.Bcol[4])
            poker.Blevel = 6;
        return poker.Blevel;
    }

    public int WIsFlush(Poker poker, String str) {
        if (poker.Wcol[0] == poker.Wcol[1] &&
                poker.Wcol[0] == poker.Wcol[2] &&
                poker.Wcol[0] == poker.Wcol[3] &&
                poker.Wcol[0] == poker.Wcol[4])
            poker.Wlevel = 6;
        return poker.Wlevel;
    }

    public int BIsStraight(Poker poker, String str) {
        if ( poker.Bnum[1] - poker.Bnum[0] == 1 &&
                poker.Bnum[2] - poker.Bnum[1] == 1 &&
                poker.Bnum[3] - poker.Bnum[2] == 1 &&
                poker.Bnum[4] - poker.Bnum[3] == 1)
            poker.Blevel = 5;
        return poker.Blevel;
    }

    public int WIsStraight(Poker poker, String str) {
        if (poker.Wnum[1] - poker.Wnum[0] == 1 &&
                poker.Wnum[2] - poker.Wnum[1] == 1 &&
                poker.Wnum[3] - poker.Wnum[2] == 1 &&
                poker.Wnum[4] - poker.Wnum[3] == 1)
            poker.Wlevel = 5;
        return poker.Wlevel;
    }

    public int BIsThree(Poker poker, String str) {
        if ((poker.Bnum[0] == poker.Bnum[1] &&
                poker.Bnum[0] == poker.Bnum[2] )||(
                poker.Bnum[1] == poker.Bnum[2] &&
                poker.Bnum[1] == poker.Bnum[3] )||(
                poker.Bnum[2] == poker.Bnum[3] &&
                poker.Bnum[2] == poker.Bnum[4]))
            poker.Blevel = 4;
        return poker.Blevel;
    }

    public int WIsThree(Poker poker, String str) {
        if ((poker.Wnum[0] == poker.Wnum[1] &&
                poker.Wnum[0] == poker.Wnum[2] )||(
                poker.Wnum[1] == poker.Wnum[2] &&
                poker.Wnum[1] == poker.Wnum[3] )||(
                poker.Wnum[2] == poker.Wnum[3] &&
                poker.Wnum[2] == poker.Wnum[4]))
            poker.Wlevel = 4;
        return poker.Wlevel;
    }

    //AABBC,AABCC,ABBCC
    public int BIsTwoPairs(Poker poker, String str) {
        if ((poker.Bnum[0] == poker.Bnum[1] &&
                poker.Bnum[2] == poker.Bnum[3] )||(
                poker.Bnum[0] == poker.Bnum[1] &&
                poker.Bnum[3] == poker.Bnum[4] )||(
                poker.Bnum[1] == poker.Bnum[2] &&
                poker.Bnum[3] == poker.Bnum[4]))
            poker.Blevel = 3;
        return poker.Blevel;
    }

    public int WIsTwoPairs(Poker poker, String str) {
        if ((poker.Wnum[0] == poker.Wnum[1] &&
                poker.Wnum[2] == poker.Wnum[3] )||(
                poker.Wnum[0] == poker.Wnum[1] &&
                poker.Wnum[3] == poker.Wnum[4] )||(
                poker.Wnum[1] == poker.Wnum[2] &&
                poker.Wnum[3] == poker.Wnum[4]))
            poker.Wlevel = 3;
        return poker.Wlevel;
    }

    //AABCD,ABBCD,ABCCD,ABCDD
    public int BIsOnePairs(Poker poker, String str) {
        if (poker.Bnum[0] == poker.Bnum[1] ||
                poker.Bnum[1] == poker.Bnum[2] ||
                poker.Bnum[2] == poker.Bnum[3] ||
                poker.Bnum[3] == poker.Bnum[4])
            poker.Blevel = 2;
        return poker.Blevel;
    }

    public int WIsOnePairs(Poker poker, String str) {
        if (poker.Wnum[0] == poker.Wnum[1] ||
                poker.Wnum[1] == poker.Wnum[2] ||
                poker.Wnum[2] == poker.Wnum[3] ||
                poker.Wnum[3] == poker.Wnum[4])
            poker.Wlevel = 2;
        return poker.Wlevel;
    }

    public int BIsHighCard(Poker poker, String str) {
        if (poker.Bnum[0] != poker.Bnum[1] &&
                poker.Bnum[1] != poker.Bnum[2] &&
                poker.Bnum[2] != poker.Bnum[3] &&
                poker.Bnum[3] != poker.Bnum[4])
            poker.Blevel = 1;
        return poker.Blevel;
    }

    public int WIsHighCard(Poker poker, String str) {
        if (poker.Wnum[0] != poker.Wnum[1] &&
                poker.Wnum[1] != poker.Wnum[2] &&
                poker.Wnum[2] != poker.Wnum[3] &&
                poker.Wnum[3] != poker.Wnum[4])
            poker.Wlevel = 1;
        return poker.Wlevel;
    }

    public int judgeBType(Poker poker, String str) {
        Judge judge = new Judge();
        judge.BIsHighCard(poker, str);
        judge.BIsOnePairs(poker, str);
        judge.BIsTwoPairs(poker, str);
        judge.BIsThree(poker, str);
        judge.BIsStraight(poker, str);
        judge.BIsFlush(poker, str);
        judge.BIsGourd(poker, str);
        judge.BIsFour(poker, str);
        judge.BIsStraightFlush(poker, str);
        judge.BIsRoyalStraightFlush(poker, str);
        return poker.Blevel;
    }

    public int judgeWType(Poker poker, String str) {
        Judge judge = new Judge();
        judge.WIsHighCard(poker, str);
        judge.WIsOnePairs(poker, str);
        judge.WIsTwoPairs(poker, str);
        judge.WIsThree(poker, str);
        judge.WIsStraight(poker, str);
        judge.WIsFlush(poker, str);
        judge.WIsGourd(poker, str);
        judge.WIsFour(poker, str);
        judge.WIsStraightFlush(poker, str);
        judge.WIsRoyalStraightFlush(poker, str);
        return poker.Wlevel;
    }
}
