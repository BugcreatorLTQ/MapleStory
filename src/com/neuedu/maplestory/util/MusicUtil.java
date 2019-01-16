package com.neuedu.maplestory.util;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/***
 * ���ֲ�������
 *
 * @author Զ��
 */
// �̳����߳���Thread
public class MusicUtil extends Thread {

	public static String bgm = "com/neuedu/maplestory/music/bgm.mp3";

	private Player player;
	private String musicPath;
	private boolean loop;

	/**
	 * ���췽����Ĭ�ϲ�ѭ�����ţ�
	 * 
	 * @param musicpath
	 */
	public MusicUtil(String musicPath) {
		this.musicPath = musicPath;
	}

	/**
	 * ���췽��(�Ƿ�ѭ��)
	 * 
	 * @param musicpath
	 *            �����ļ�����·��
	 */
	public MusicUtil(String musicpath, boolean loop) {
		this(musicpath);
		this.loop = loop;
	}

	/**
	 * ��дrun����
	 */
	@Override
	public void run() {
		super.run();
		try {
			if (loop) {
				while (true) {
					play();
				}
			} else {
				play();
			}
		} catch (FileNotFoundException | JavaLayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ŷ���
	 * 
	 * @throws FileNotFoundException
	 * @throws JavaLayerException
	 */
	private void play() throws FileNotFoundException, JavaLayerException {
		BufferedInputStream buffer = new BufferedInputStream(
				MusicUtil.class.getClassLoader().getResourceAsStream(musicPath));
		player = new Player(buffer);
		player.play();
	}

}