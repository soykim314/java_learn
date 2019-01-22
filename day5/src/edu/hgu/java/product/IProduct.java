package edu.hgu.java.product;

public interface IProduct {

	/**
	 * 정상저장되면, True, 저장이 안되면 False.
	 * SN과 name이 틀리면 배열에 제품정보를 저장하는 함수
	 */
	public abstract boolean addProduct(Product p);
	/**
	 * 현재 배열에 저장된 전체 정보를 리턴하는 함수
	 */
	public abstract Product[] getAllProducts();
	/**
	 * 현재 배열에 저장된 특정 제품의 정보를 리턴하는 함수
	 */
	public abstract Product getProduct(String sn);
	/**
	 * 현재 배열에 저장된 제품의 정보를 변경하는 데
	 * SN에 해당하는 제품의 브랜드만 수정이 가능함
	 */
	public abstract boolean updateProInfo(String sn, String brand);
	
	
	
}
