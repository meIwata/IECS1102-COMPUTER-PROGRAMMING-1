package java_0325;

public class Poetry {
    public static void main(String[] args) {
        char[][] poetry = new char[4][5];

        poetry[0][0] = '春';
        poetry[0][1] = '眠';
        poetry[0][2] = '不';
        poetry[0][3] = '覺';
        poetry[0][4] = '曉';

        poetry[1][0] = '處';
        poetry[1][1] = '處';
        poetry[1][2] = '聞';
        poetry[1][3] = '啼';
        poetry[1][4] = '鳥';

        poetry[2][0] = '夜';
        poetry[2][1] = '來';
        poetry[2][2] = '風';
        poetry[2][3] = '雨';
        poetry[2][4] = '聲';

        poetry[3][0] = '花';
        poetry[3][1] = '落';
        poetry[3][2] = '知';
        poetry[3][3] = '多';
        poetry[3][4] = '少';
        for (int i = 0; i < poetry.length; i++) {
            for (int j = 0; j < poetry[i].length; j++) {
                System.out.print(poetry[i][j]);
            }
            System.out.println();
        }
    }
}
