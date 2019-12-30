package com.WUT.RW.model;

import java.io.Serializable;

/**
 * YongHu ���f���N���X.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Yonghu implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** YongHuMing. */
	private String yonghuming;

	/** YongHuDianHua. */
	private String yonghudianhua;

	/** YongHuXingBie. */
	private String yonghuxingbie;

	/** YongHuDiZhi. */
	private String yonghudizhi;

	/** YongHuEmailDiZhi. */
	private String yonghuemaildizhi;

	/**
	 * �R���X�g���N�^.
	 */
	public Yonghu() {
	}

	/**
	 * YongHuMing ��ݒ肵�܂�.
	 * 
	 * @param yonghuming
	 *            YongHuMing
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}

	/**
	 * YongHuMing ���擾���܂�.
	 * 
	 * @return YongHuMing
	 */
	public String getYonghuming() {
		return this.yonghuming;
	}

	/**
	 * YongHuDianHua ��ݒ肵�܂�.
	 * 
	 * @param yonghudianhua
	 *            YongHuDianHua
	 */
	public void setYonghudianhua(String yonghudianhua) {
		this.yonghudianhua = yonghudianhua;
	}

	/**
	 * YongHuDianHua ���擾���܂�.
	 * 
	 * @return YongHuDianHua
	 */
	public String getYonghudianhua() {
		return this.yonghudianhua;
	}

	/**
	 * YongHuXingBie ��ݒ肵�܂�.
	 * 
	 * @param yonghuxingbie
	 *            YongHuXingBie
	 */
	public void setYonghuxingbie(String yonghuxingbie) {
		this.yonghuxingbie = yonghuxingbie;
	}

	/**
	 * YongHuXingBie ���擾���܂�.
	 * 
	 * @return YongHuXingBie
	 */
	public String getYonghuxingbie() {
		return this.yonghuxingbie;
	}

	/**
	 * YongHuDiZhi ��ݒ肵�܂�.
	 * 
	 * @param yonghudizhi
	 *            YongHuDiZhi
	 */
	public void setYonghudizhi(String yonghudizhi) {
		this.yonghudizhi = yonghudizhi;
	}

	/**
	 * YongHuDiZhi ���擾���܂�.
	 * 
	 * @return YongHuDiZhi
	 */
	public String getYonghudizhi() {
		return this.yonghudizhi;
	}

	/**
	 * YongHuEmailDiZhi ��ݒ肵�܂�.
	 * 
	 * @param yonghuemaildizhi
	 *            YongHuEmailDiZhi
	 */
	public void setYonghuemaildizhi(String yonghuemaildizhi) {
		this.yonghuemaildizhi = yonghuemaildizhi;
	}

	/**
	 * YongHuEmailDiZhi ���擾���܂�.
	 * 
	 * @return YongHuEmailDiZhi
	 */
	public String getYonghuemaildizhi() {
		return this.yonghuemaildizhi;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((yonghuming == null) ? 0 : yonghuming.hashCode());

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Yonghu other = (Yonghu) obj;
		if (yonghuming == null) {
			if (other.yonghuming != null) {
				return false;
			}
		} else if (!yonghuming.equals(other.yonghuming)) {
			return false;
		}

		return true;
	}

}