package TexaPoker;

import java.util.Arrays;

public class Judge {

    //皇家同花顺
    public int isRoyalStraightFlush(Poker poker, String str) {
        if (poker.col[0] == poker.col[1] && poker.col[0] == poker.col[2] &&
                poker.col[0] == poker.col[3] && poker.col[0] == poker.col[4] &&
                poker.num[1] - poker.num[0] == 1 && poker.num[2] - poker.num[1] == 1 &&
                poker.num[3] - poker.num[2] == 1 && poker.num[4] - poker.num[3] == 1 &&
                poker.num[4] == 14) {
            poker.level = 10;
            poker.comparePoint[4] = 0;
            poker.comparePoint[3] = 0;
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //同花顺
    public int isStraightFlush(Poker poker, String str) {
        if (poker.col[0] == poker.col[1] && poker.col[0] == poker.col[2] &&
                poker.col[0] == poker.col[3] && poker.col[0] == poker.col[4] &&
                poker.num[1] - poker.num[0] == 1 && poker.num[2] - poker.num[1] == 1 &&
                poker.num[3] - poker.num[2] == 1 && poker.num[4] - poker.num[3] == 1) {
            poker.level = 9;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = 0;
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //四条,AAAAB,ABBBB
    public int isFour(Poker poker, String str) {
        if (poker.num[0] == poker.num[1] && poker.num[0] == poker.num[2] &&
                poker.num[0] == poker.num[3]) {
            poker.level = 8;
            poker.comparePoint[4] = poker.num[3];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[1] == poker.num[2] && poker.num[1] == poker.num[3] &&
                poker.num[1] == poker.num[4]) {
            poker.level = 8;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[0];
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //葫芦,AAABB,AABBB
    public int isGourd(Poker poker, String str) {
        if (poker.num[0] == poker.num[1] && poker.num[0] == poker.num[2] &&
                poker.num[3] == poker.num[4] ) {
            poker.level = 7;
            poker.comparePoint[4] = poker.num[2];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[0] == poker.num[1] && poker.num[2] == poker.num[3] &&
                poker.num[3] == poker.num[4]) {
            poker.level = 7;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[1];
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //同花
    public int isFlush(Poker poker, String str) {
        if (poker.col[0] == poker.col[1] && poker.col[0] == poker.col[2] &&
                poker.col[0] == poker.col[3] && poker.col[0] == poker.col[4]) {
            poker.level = 6;
            poker.comparePoint = Arrays.copyOf(poker.num, 5);
        }
        return poker.level;
    }

    //顺子
    public int isStraight(Poker poker, String str) {
        if ( poker.num[1] - poker.num[0] == 1 && poker.num[2] - poker.num[1] == 1 &&
                poker.num[3] - poker.num[2] == 1 && poker.num[4] - poker.num[3] == 1) {
            poker.level = 5;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = 0;
            poker.comparePoint[2] = 0;
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //三条,AAABC,ABBBC,ABCCC
    public int isThree(Poker poker, String str) {
        if (poker.num[0] == poker.num[1] && poker.num[0] == poker.num[2]) {
            poker.level = 4;
            poker.comparePoint[4] = poker.num[2];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = poker.num[3];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[1] == poker.num[2] && poker.num[1] == poker.num[3]) {
            poker.level = 4;
            poker.comparePoint[4] = poker.num[3];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = poker.num[0];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[2] == poker.num[3] && poker.num[2] == poker.num[4]) {
            poker.level = 4;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[1];
            poker.comparePoint[2] = poker.num[0];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //两对,AABBC,AABCC,ABBCC
    public int isTwoPairs(Poker poker, String str) {
        if (poker.num[0] == poker.num[1] && poker.num[2] == poker.num[3]) {
            poker.level = 3;
            poker.comparePoint[4] = poker.num[3];
            poker.comparePoint[3] = poker.num[1];
            poker.comparePoint[2] = poker.num[4];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[0] == poker.num[1] && poker.num[3] == poker.num[4]) {
            poker.level = 3;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[1];
            poker.comparePoint[2] = poker.num[2];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        } else if (poker.num[1] == poker.num[2] && poker.num[3] == poker.num[4]) {
            poker.level = 3;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[2];
            poker.comparePoint[2] = poker.num[0];
            poker.comparePoint[1] = 0;
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //一对,AABCD,ABBCD,ABCCD,ABCDD
    public int isOnePairs(Poker poker, String str) {
        if (poker.num[0] == poker.num[1]) {
            poker.level = 2;
            poker.comparePoint[4] = poker.num[1];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = poker.num[3];
            poker.comparePoint[1] = poker.num[2];
            poker.comparePoint[0] = 0;
        } else if (poker.num[1] == poker.num[2]) {
            poker.level = 2;
            poker.comparePoint[4] = poker.num[2];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = poker.num[3];
            poker.comparePoint[1] = poker.num[0];
            poker.comparePoint[0] = 0;
        } else if (poker.num[2] == poker.num[3]) {
            poker.level = 2;
            poker.comparePoint[4] = poker.num[3];
            poker.comparePoint[3] = poker.num[4];
            poker.comparePoint[2] = poker.num[1];
            poker.comparePoint[1] = poker.num[0];
            poker.comparePoint[0] = 0;
        } else if (poker.num[3] == poker.num[4]) {
            poker.level = 2;
            poker.comparePoint[4] = poker.num[4];
            poker.comparePoint[3] = poker.num[2];
            poker.comparePoint[2] = poker.num[1];
            poker.comparePoint[1] = poker.num[0];
            poker.comparePoint[0] = 0;
        }
        return poker.level;
    }

    //高牌,即散牌
    public int isHighCard(Poker poker, String str) {
        if (poker.num[0] != poker.num[1] && poker.num[1] != poker.num[2] &&
                poker.num[2] != poker.num[3] && poker.num[3] != poker.num[4]){
            poker.level = 1;
            poker.comparePoint = Arrays.copyOf(poker.num, 5);
        }
        return poker.level;
    }

    public int judgeType(Poker poker, String str) {
        Judge judge = new Judge();
        judge.isHighCard(poker, str);
        judge.isOnePairs(poker, str);
        judge.isTwoPairs(poker, str);
        judge.isThree(poker, str);
        judge.isStraight(poker, str);
        judge.isFlush(poker, str);
        judge.isGourd(poker, str);
        judge.isFour(poker, str);
        judge.isStraightFlush(poker, str);
        judge.isRoyalStraightFlush(poker, str);
        return poker.level;
    }

}
