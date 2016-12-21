package testPack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testPack {
	 public static void main(String args[]){  
	        //新建一个JFrame对象frame，同时其标题栏为No Title  
	        JFrame frame=new JFrame("No Title");  
		 frame.setabc(";lslsl");
	        //新建一个JLabel组件label，里面的内容为Hello world!  
	        JLabel label=new JLabel("Hello world!");  
	        //新建一个JPanel面板panel，上面用来摆东西  
	        JPanel panel=new JPanel();  
	        //在panel上面摆上label  
	        panel.add(label);  
	        //设置panel的布局为任意null布局，这样下面的setBounds语句才能生效，并且label在这个面板的(125,75)位置，且大小为100x20px  
	        panel.setLayout(null);  
	        label.setBounds(125,75,100,20);  
	        //在frame中添加panel  
	        frame.getContentPane().add(panel);  
	        //设置frame的大小为300x200，且可见默认是不可见的  
	        frame.setSize(300,200);  
	        frame.setVisible(true);  
	        //使右上角的关闭按钮生效，如果没有这句，点击右上角的关闭按钮只能关闭窗口，无法结束进程  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    }  
}
