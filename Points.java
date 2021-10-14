import java.util.ArrayList;
import java.awt.Point;

/**
 * Points クラスは複数のPointクラスのインスタンスを持つ。
 * Pointクラスはフィールドとしてx, yを持つ。
 */
public class Points {
    public ArrayList<Point> points;

    public Points () {
        points = new ArrayList<Point>();
    }

    /**
     * 点(Pointクラスのインスタンス)を追加する
     * @param p Point
     */
    public void addPoint(Point p){
        points.add(p);
    }

    /**
     * 引数(x,y)と同じ座標を持つを保持しているかを判断する。
     * @param x x座標
     * @param y y座標
     *
     * @return 同じ座標を持つ点が存在すればtrue, そうでなければfalse。
     */
    public boolean pointExists(int x, int y) {
        boolean f = false;
        boolean ff = false;

        for(int i=0 ; !(f && ff) && i < points.size() ; i++) {
            Point point = points.get(i);
            if (point.x == x) {
                f = true;
            }else{
                f = false;
            }

            if (point.y == y) {
                ff = true;
            }else{
                ff = false;
            }
        }

        boolean fff = false;
        if (f && ff) {
            fff = true;
        }else{
            fff = false;
        }
        return fff;
    }

    public static void main(String[] args) {
        /* ここにテストケースを書き込む
         * 1) Pointsクラスのインスタンスを生成する
         * 2) 適当な値で初期化したPointクラスのインスタンスを1)に追加する
         * 3) もうひとつPointクラスのインスタンスを1)に追加する
         * 4) ....
         * 5) 1)に指定した座標をもつ点が存在するか(pointsExists)聞く
         * 　　存在する場合、しない場合の両者ともに実行してみる
         */
    }
}