package TexaPoker;

public class Compare {

    public String isCompareCardSize(Poker black, Poker white) {
        int flag = 0;
        if (black.level > white.level)
            flag = 1;
        else if (black.level < white.level)
            flag = 2;
        else {
            for (int i=4; i>=0; i--){
                if (black.comparePoint[i] > white.comparePoint[i]) {
                    flag = 1;
                    break;
                }
                else if (black.comparePoint[i] < white.comparePoint[i]) {
                    flag = 2;
                    break;
                }
            }
        }
        if (flag == 1)
            return "Black wins";
        else if (flag == 2)
            return "White wins";
        else
            return "Tie";
    }
}
