import java.awt.Color;
import java.awt.Insets;
import javax.swing.JFrame;

/**
 * 今回はJFrameの実験
 * まずはウィンドウを出してみよう
 * @author bedaka
 */

public class Lesson2{
    /**
     * JFrameをframe1という名前でインスタンス化
     */
    public JFrame frame1;



    /**
     *  自身のコンストラクタ。
     *  インスタンス時実行される
     *  今回はこの中に処理を記載
     */
    public Lesson2() {
        //frame1の中にJFrameをインスタンス化
        frame1 = new JFrame("ゲームテスト");

        int width = 600;
        int height = 400;

        //閉じるボタンの挙動
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ウィンドウを表示するか？
        frame1.setVisible(true);
        //ウィンドウのフレームの大きさを取得できるクラスをインスタンス化
        //InsetはsetVisibleの後でないと正しい値が取得できないぴえん
        Insets insets = frame1.getInsets();
        //ウィンドウのサイズを設定(描画可能場所とフレームが込みの)
        frame1.setSize(
            insets.left + insets.right + width,
            insets.top + insets.bottom + height);
        //背景の色を設定(白)
        frame1.setBackground(new Color(255, 255, 255));
        //マウスによるウィンドウのサイズ変更をできなくする
        frame1.setResizable(false);
        //ウィンドウを中央へ配置
        frame1.setLocationRelativeTo(null);
    }



    /**
     * --main関数--
     * @param args maybeコマンドプロンプトからのメッセージを受け取る
     */
    public static void main(String[] args){
        Lesson2 me = new Lesson2();
    }
}