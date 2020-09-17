package Caro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

//Khởi tạo 1 lưới các ô vuông là các button

public class Caro extends JPanel implements ActionListener {

    static int COUNT = 0;

    JPanel panelNorth = new JPanel();
    JPanel panelWest = new JPanel();
    JPanel panelEast = new JPanel();
    JPanel panelSouth = new JPanel();
    JPanel panelCenter = new JPanel();//tạo mới 1 jpanel có tên là pan

    public JFrame frame = new JFrame();//tạo mới 1 jframe có tên là frame
    public int n = 20, m = 20, diem = 0;//khởi tạo các giá trị : kích thước của từng button, điểm
    public JButton btn[][] = new JButton[n][m];//Tạo mới 1 jbutton kiểu mảng 2 chiều có n,m phần tử
    static String pos[][] = new String[20][20]; //Tạo 1 biến kiểu int chứa giá trị tương ứng của phần tử trong mảng 2 chiều

    //ham add
    public void add() { //Khởi tạo 1 hàm để add các giá trị vào
        frame.setLayout(new BorderLayout());

        panelNorth.setBackground(Color.pink);
        panelEast.setBackground(Color.lightGray);
        panelSouth.setBackground(Color.pink);
        panelWest.setBackground(Color.lightGray);

        JLabel lbHeader = new JLabel("GAME CARO");

        panelNorth.add(lbHeader);

        JLabel lbPlayer1 = new JLabel("Player 1 : X  ");
        panelEast.add(lbPlayer1);

        JLabel lbPlayer2 = new JLabel("Player 2 : O");
        panelWest.add(lbPlayer2);

        JButton btnStart = new JButton("Start");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Trò Chơi Mới", "Thoát", JOptionPane.INFORMATION_MESSAGE);
                for (int i1 = 0; i1 < n; i1++) {
                    for (int j1 = 0; j1 < m; j1++) {
                        btn[i1][j1].setText("");
                        btn[i1][j1].setBackground(Color.white);
                    }
                }
            }
        });

        panelSouth.add(btnStart);

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelCenter); //add jpanel vào 1 jframe
        panelCenter.setLayout(new GridLayout(n, m));//xét giá trị vào jpanel
        for (int i = 0; i < n; i++) {//số hàng của jpanel
            for (int j = 0; j < m; j++) {
                btn[i][j] = new JButton();//khởi tạo bộ nhớ cho từng jbutton
                btn[i][j].addActionListener(this);//khi con trỏ chuột trỏ vào phần tử tương ứng nào
                panelCenter.add(btn[i][j]);//add giá trị vào phần tử trỏ chuột tương ứng
                btn[i][j].setBackground(Color.white);//Xét màu cho Jbutton tương ứng đang xét
            }
        }

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        panelCenter.setSize(700, 9000);
        panelEast.setSize(50, 9000);
        panelWest.setSize(50, 9000);
        frame.setSize(1500, 700);
        frame.setResizable(false);
    }
    /**/
    JLabel lb1 = new JLabel();
    JLabel lb2 = new JLabel();

    /**/
    //tim o trong de set text
    public void actionPerformed(ActionEvent e) {
        /**/
        if (COUNT == 0) {
            panelEast.add(lb1);
            lb1.setLocation(100, 100);
            panelWest.add(lb2);
            lb2.setLocation(100, 100);
        } else {
            panelEast.remove(lb1);
            panelWest.remove(lb2);
            panelEast.add(lb1);
            lb1.setLocation(100, 100);
            panelWest.add(lb2);
            lb2.setLocation(100, 100);
        }
        COUNT = 1;
        /**/

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (btn[i][j].getText() != "X" && btn[i][j].getText() != "O") {
                    if (diem % 2 == 0) {
                        if (e.getSource() == btn[i][j]) {
                            btn[i][j].setText("X");
                            btn[i][j].setForeground(Color.RED);
                            diem++;
                            if (win(i, j, btn[i][j].getText())) {
                                btn[i][j].setBackground(Color.green);
                                JOptionPane.showMessageDialog(null, "Player 1 win!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                for (int i1 = 0; i1 < n; i1++) {
                                    for (int j1 = 0; j1 < m; j1++) {
                                        pos[i1][j1] = btn[i1][j1].getText();
                                        btn[i1][j1].setText("");
                                        btn[i1][j1].setBackground(Color.white);
                                    }
                                }
                            }
                        }
                    } else {
                        readTxt r = new readTxt();
                        r.abc(pos);
                        btn[r.nextMoveX][r.nextMoveY].setText("O");
                        btn[r.nextMoveX][r.nextMoveY].setForeground(Color.BLACK);
                        diem++;
                        if (win(r.nextMoveX, r.nextMoveY, btn[r.nextMoveX][r.nextMoveY].getText())) {
                            btn[r.nextMoveX][r.nextMoveY].setBackground(Color.green);
                            JOptionPane.showMessageDialog(null, "Player 2 win!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Trò Chơi Mới", "Thoát", JOptionPane.INFORMATION_MESSAGE);
                            for (int i1 = 0; i1 < n; i1++) {
                                for (int j1 = 0; j1 < m; j1++) {
                                    btn[i1][j1].setText("");
                                    btn[i1][j1].setBackground(Color.white);
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    //kiem tra thang
    public boolean win(int x, int y, String name) {
        int k, j;
        int d = 0;
        // kt chieu doc
        for (k = -4; k <= 4; k++) {
            if (x + k >= 0 && x + k < n) {
                if (btn[x + k][y].getText() == name) {
                    d++;
                } else if (d < 5) {
                    d = 0;
                }
            }
        }
        if (d >= 5) {
            return true;
        } else {
            d = 0;
        }
        //xet ngang
        for (k = -4; k <= 4; k++) {
            if (y + k >= 0 && y + k < n) {
                if (btn[x][y + k].getText() == name) {
                    d++;
                } else if (d < 5) {
                    d = 0;
                }
            }
        }
        if (d >= 5) {
            return true;
        } else {
            d = 0;
        }
        //cheo
        for (k = -4; k <= 4; k++) {
            if (y + k >= 0 && y + k < n && x - k >= 0 && x - k < m) {
                if (btn[x - k][y + k].getText() == name) {
                    d++;
                } else if (d < 5) {
                    d = 0;
                }
            }
        }
        if (d >= 5) {
            return true;
        } else {
            d = 0;
        }
        for (k = -4; k <= 4; k++) {
            if (y + k >= 0 && y + k < n && x + k >= 0 && x + k < m) {
                if (btn[x + k][y + k].getText() == name) {
                    d++;
                } else if (d < 5) {
                    d = 0;
                }
            }
        }
        if (d >= 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Caro c = new Caro();
        c.add();
    }
}
