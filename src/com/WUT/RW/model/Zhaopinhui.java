package com.WUT.RW.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ZhaoPinHui ���f���N���X.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Zhaopinhui implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ZhaoPingHuiDiDian. */
	private String zhaopinghuididian;

	/** ZhaoPinHuiShiJian. */
	private Date zhaopinhuishijian;

	/** ZhaoPinHuiName. */
	private String zhaopinhuiname;

	/**
	 * �R���X�g���N�^.
	 */
	public Zhaopinhui() {
	}

	/**
	 * ZhaoPingHuiDiDian ��ݒ肵�܂�.
	 * 
	 * @param zhaopinghuididian
	 *            ZhaoPingHuiDiDian
	 */
	public void setZhaopinghuididian(String zhaopinghuididian) {
		this.zhaopinghuididian = zhaopinghuididian;
	}

	/**
	 * ZhaoPingHuiDiDian ���擾���܂�.
	 * 
	 * @return ZhaoPingHuiDiDian
	 */
	public String getZhaopinghuididian() {
		return this.zhaopinghuididian;
	}

	/**
	 * ZhaoPinHuiShiJian ��ݒ肵�܂�.
	 * 
	 * @param zhaopinhuishijian
	 *            ZhaoPinHuiShiJian
	 */
	public void setZhaopinhuishijian(Date zhaopinhuishijian) {
		this.zhaopinhuishijian = zhaopinhuishijian;
	}

	/**
	 * ZhaoPinHuiShiJian ���擾���܂�.
	 * 
	 * @return ZhaoPinHuiShiJian
	 */
	public Date getZhaopinhuishijian() {
		return this.zhaopinhuishijian;
	}

	/**
	 * ZhaoPinHuiName ��ݒ肵�܂�.
	 * 
	 * @param zhaopinhuiname
	 *            ZhaoPinHuiName
	 */
	public void setZhaopinhuiname(String zhaopinhuiname) {
		this.zhaopinhuiname = zhaopinhuiname;
	}

	/**
	 * ZhaoPinHuiName ���擾���܂�.
	 * 
	 * @return ZhaoPinHuiName
	 */
	public String getZhaopinhuiname() {
		return this.zhaopinhuiname;
	}


}