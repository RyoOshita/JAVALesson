import java.awt.Color;
import java.awt.Insets;

import javax.swing.JFrame;

/**
 * Timerクラスを使用してゲームの処理速度を調整
 * TimerTaskクラスにあるrunメゾット（関数）に制御したい処理を記述すると制御できるがクラスライブラリに登録されているため書き換えはできない
 * そこで、継承という機能？を使用する。
 * 継承とは、簡単にいうとすでにあるクラスを受け継ぎ新しいクラスを作成することである
 * @author bedaka
 */

public class Lesson3 {
    JFrame frame;

    Lesson3(){
        int w = 600, h = 400;

        frame = new JFrame("ゲームテスト");
        frame.setDefaultCloseOperation(3);
        frame.setBackground(new Color(255, 255, 255));
        frame.setResizable(false);

        frame.setVisible(true);
        Insets is = frame.getInsets();
        frame.setSize(is.left + is.right + w, is.top + is.bottom + h);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        Lesson3 L3 = new Lesson3();
    }
}