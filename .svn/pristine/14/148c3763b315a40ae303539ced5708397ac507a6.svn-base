package com.chinasofti.eec.day000;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

import javax.swing.JFrame;

public class Stars {

	public static void main(String[] args) {
		JFrame w = new JFrame();
		// 创建一个框
		MyPanel mp = new MyPanel();
		// 创建面板

		w.add(mp);
		// 给w JFrame框架添加Panel面板
		w.setSize(1024, 768);
		w.setLocationRelativeTo(null);
		// 屏幕居中

		// w.setBackground(Color.RED);
		// 没有办法直接给框上色，框是空的，显示不出框的颜色
		w.setResizable(false);
		// 设置窗体大小不可变化
		w.show();
		// w.setVisible(true);
		// 上两句代码均是显示窗口
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//给JFrame设置默认自动关闭操作
		Thread t = new Thread(mp);
		t.start();
	}
}

class MyPanel extends Panel implements Runnable {
	public MyPanel() {
		this.setBackground(Color.BLACK);
		// 给面板初始化颜色
	}
	public void paint(Graphics draw_pen){
		//传参数进来 Graphics
		draw_pen.setColor(Color.yellow);
		draw_pen.fillOval(600, 100, 100, 100);
		//圆形
		draw_pen.setColor(Color.black);
		draw_pen.fillOval(580, 60, 100, 100);
		//圆形遮罩
		int stars_num = 300;
		for(int i = 0; i < stars_num; ++i){
			int star_size = (int)(Math.random()*50);
			Font star_font = new Font("font", Font.BOLD, star_size);
			draw_pen.setFont(star_font);
			Color stars_color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
			draw_pen.setColor(stars_color);
			draw_pen.drawString("*", (int)(Math.random()*1024), (int)(Math.random()*768));
		}
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
}
