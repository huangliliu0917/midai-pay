package com.midai.pay.changjie.bean;

/**
 * G10007接口  Bean
 * @author Thinker
 *
 */
public class G10007Bean extends Gw01MsgBase{
	/** 业务代码, 接入生产前，业务人员会提供 */
	private String businessCode;
	/** 产品编码, 接入生产前，业务人员会提供 */
	private String productCode;
	/** 对公对私 */
	private String publicPersonal;
	/** 付款方账号 */
	private String payAcctNo;
	/** 收款方账号 */
	private String recAcctNo;
	/** 收款方账户名称 */
	private String recAcctName;
	/**开户行名称 如：中国建设银行广州东山广场分理处*/
	private String bankName;
	/** 开户行号， 对方账号对应的开户行支行行号 */
	private String bankCode;
	/** 开户行所在省 */
	private String province;
	/** 开户行所在市 */
	private String city;
	/** 货币类型*/
	private long currency;
	/** 金额 */
	private long amount;
	/** 开户证件类型 */
	private String idType;
	/** 证件号 */
	private String id;
	/** 手机号 */
	private String tel;
	/** 备注 */
	private String summary;
	/** 用途 */
	private String postscript;
	/** 外部企业流水号 */
	private String corpFlowNo;
	/** 外部企业订单号 */
	private String corpOrderNo;
	
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getPublicPersonal() {
		return publicPersonal;
	}
	public void setPublicPersonal(String publicPersonal) {
		this.publicPersonal = publicPersonal;
	}
	public String getPayAcctNo() {
		return payAcctNo;
	}
	public void setPayAcctNo(String payAcctNo) {
		this.payAcctNo = payAcctNo;
	}
	public String getRecAcctNo() {
		return recAcctNo;
	}
	public void setRecAcctNo(String recAcctNo) {
		this.recAcctNo = recAcctNo;
	}
	public String getRecAcctName() {
		return recAcctName;
	}
	public void setRecAcctName(String recAcctName) {
		this.recAcctName = recAcctName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getCurrency() {
		return currency;
	}
	public void setCurrency(long currency) {
		this.currency = currency;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPostscript() {
		return postscript;
	}
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	public String getCorpFlowNo() {
		return corpFlowNo;
	}
	public void setCorpFlowNo(String corpFlowNo) {
		this.corpFlowNo = corpFlowNo;
	}
	public String getCorpOrderNo() {
		return corpOrderNo;
	}
	public void setCorpOrderNo(String corpOrderNo) {
		this.corpOrderNo = corpOrderNo;
	}
	
	
}
