/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8.jtree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author apple
 */
public class DisplayMasterDetailsGUI 
extends JFrame implements TreeSelectionListener{
//Khai báo dành cho Tree
private DefaultTreeModel treeModel;
private DefaultMutableTreeNode root;
private JTree tree;
//Khai báo dành cho table
private DefaultTableModel tableModel;
private JTable table;

private Connection con;//connection đến DB
private JLabel lblStatus;// hiển thị thông tin thao tác

public DisplayMasterDetailsGUI() {
    setTitle("hss");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(700,500);
    tieude();
    createBody();
    buildTree();
    bottom();
    }
    /**
    * Tạo giao diện chính
    */
    void createBody(){
    //tạo cây
    root=new DefaultMutableTreeNode("Lớp học");
    treeModel=new DefaultTreeModel(root);
    tree=new JTree(treeModel);
    tree.addTreeSelectionListener(this);

    //tạo bảng
    String []header={"Mã số sv","họ tên","email","địa chỉ"};
    tableModel=new DefaultTableModel(header,0);
    table=new JTable(tableModel);
    table.setPreferredScrollableViewportSize(new Dimension(300,400));
    table.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
    table.getTableHeader().setForeground(Color.blue);

    JPanel pTree=new JPanel(new BorderLayout());
    JPanel pTable=new JPanel(new BorderLayout());

    JSplitPane spMain=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pTree,pTable);
    spMain.setOneTouchExpandable(true);
    this.add(spMain,BorderLayout.CENTER);

    pTree.add(new JScrollPane(tree));
    tree.setPreferredSize(new Dimension(250,200));
    pTable.add(new JScrollPane(table));


    }

    /**
    * Xây dựng cây dựa trên bản lớp
    */
    void buildTree(){
    try {
    con=ConnectionFactory.CreateMySQLConnection("masterdetailsdemo");
    String sql="select * from Lophoc";
    ResultSet rs=con.createStatement().executeQuery(sql);

    while(rs.next()){
    Lophoc lh=new Lophoc(rs.getString("msLop"),
    rs.getString("tenLop"),
    rs.getString("giaovienCN"));
    DefaultMutableTreeNode node=new DefaultMutableTreeNode(lh);
    root.add(node);
    }
    tree.expandRow(0);
    } catch (Exception e) {
    e.printStackTrace();
    }
    }
    /**
    * Hiển thị danh sách sinh viên trong 1 lớp
    * @param classID là mã số lớp chỉ định hiển thị
    */
    void displayStudentInclass(String classID){
    try {
    String sql="select * from Sinhvien where msLop='"+classID+"'";
    ResultSet rs=con.createStatement().executeQuery(sql);
    //clear table
    tableModel.setRowCount(0);
    while(rs.next()){
    String []row={
    rs.getString("msSV"),
    rs.getString("hoTen"),
    rs.getString("email"),
    rs.getString("diaChi"),
    };
    tableModel.addRow(row);
    }
    } catch (Exception e) {
    e.printStackTrace();
    }
    }

    /**
    * Hiển thị tiêu đề
    */
    void tieude(){
    JLabel lbl=new JLabel("MASTER-DETAILS EXAMPLE",JLabel.CENTER);
    lbl.setFont(new Font("Arial",Font.BOLD,24));
    lbl.setForeground(Color.red);
    add(lbl,BorderLayout.NORTH);
    }

    /**
    * Hiển thị thanh status bar
    */
    void bottom(){
    JPanel p=new JPanel(new BorderLayout());
    lblStatus=new JLabel("information");
    lblStatus.setFont(new Font("Arial",Font.PLAIN,13));
    lblStatus.setForeground(Color.red);
    p.add(lblStatus);
    this.add(p,BorderLayout.SOUTH);
    }

    /**
    * Sự kiện cho việc chọn 1 nút trên JTree
    */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
    DefaultMutableTreeNode selNode=(DefaultMutableTreeNode)e.getPath().getLastPathComponent();
    if(selNode.isLeaf()){
    Lophoc lh=(Lophoc)selNode.getUserObject();
    lblStatus.setText("Đang chọn: "+lh.getMsLop()
    +" – Tên lớp: "+lh.getTenLop()
    +" – Giáo viên CN: "+lh.getGiavienCN());
    displayStudentInclass(lh.getMsLop());
    }
    else
    lblStatus.setText("Vui lòng chọn lớp để xem danh sách");
    }
}
