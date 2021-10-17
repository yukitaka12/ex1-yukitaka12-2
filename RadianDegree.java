/**
 * RadianDegreeクラスはRadian(ラジアン)とDegree(度)を変換するメソッドを提供する
 */
public class RadianDegree {
    public static double pi = 3.14159265358979323846;
    public static double degreesPi = 180.0;
    /**
     * 度をラジアンに変換する
     * @param degree 度
     * @return ラジアン
     */
    public static double degreeToRadian(double degree) {
        return degree / degreesPi * pi;
    }

    /**
     * ラジアンを度に変換する
     * @param radian ラジアン
     * @return 度
     */
    public static double radianToDegree(double radian) {
        return radian * (degreesPi / pi);
    }

    public static void main(String[] args) {
        /* ここにテストケースを書き込む
         * degreeToRadian, radianToDegreeの両者ともを使用すること
         */
        double degree = 90.0;
        double radian = 90.0;
        System.out.println("degree: "+degree+" --> radian: "+RadianDegree.degreeToRadian(degree));
        System.out.println("radian: "+radian+" --> degree: "+RadianDegree.radianToDegree(radian));
    }
}
