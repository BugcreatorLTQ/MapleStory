package com.neuedu.maplestory.entity;

import java.awt.Image;

import com.neuedu.maplestory.util.ImageUtil;

public class Ground extends Shape {

	public static final Image IMAGE  = ImageUtil.imgBackGround.ground[0];

	public Ground(int x, int y) {
		super(ImageUtil.imgBackGround.ground, x, y);
	}
	
	


}
