package com.neuedu.maplestory.client;

import java.awt.Frame;

/**
 * ����ð�յ���Ŀ���ļ����ͻ��� ���ɴ��� 
 * 1.extends Frame��� 
 * 2.�Զ�����ش��ڵķ���
 * 3.��������������
 * 
 * @author Lain
 *
 */

public class MapleStoryClient extends Frame {

	/**
	 * ���ش��ڵķ���
	 */
	void loadFrame() {
		// ���ô��ڴ�С
		this.setSize(1920, 1080);
		// ���ô�������ʱ��λ��
		this.setLocation(0, 0);
		// ��ʾ����
		this.setVisible(true);
		// ���ÿɹر�
	}

	/**
	 * ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new MapleStoryClient();
	}
	
	/**
	 * ���췽��
	 */
	public MapleStoryClient() {
		// TODO Auto-generated constructor stub
		loadFrame();
	}
}
