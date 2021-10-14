/**
 * RadianDegreeクラスはRadian(ラジアン)とDegree(度)を変換するメソッドを提供する
 */
public class RadianDegree {
    /**
     * 度をラジアンに変換する
     * @param degree 度
     * @return ラジアン
     */
    public static double degreeToRadian(double degree) {
        return degree / 180.0 * 3.14159265358979323846;
    }

    /**
     * ラジアンを度に変換する
     * @param radian ラジアン
     * @return 度
     */
    public static double radianToDegree(double radian) {
        return radian * (180.0 / 3.14159265358979323846);
    }

    public static void main(String[] args) {
        /* ここにテストケースを書き込む
         * degreeToRadian, radianToDegreeの両者ともを使用すること
         */
    }
}
