package pe.com.jorgeberrios.crud.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;
/*
import org.codehaus.jackson.annote.JsonIgnoreProperties;
import org.codehaus.jackson.annote.JsonProperty;
import org.codehaus.jackson.annote.JsonPropertyOrder;
@JsonPropertyOrder("code")
@JsonIgnoreProperties(ignoreUnkown=true)
*/
@XmlRootElement
public class BranchOfficeDto implements Serializable{
	private static final long serialVersionUID = 1L;
	//@JsonProperty("code")
	private String code;
	//@JsonProperty("name")
	private String  name;
	//@JsonProperty("address")
	private String  address;
	//@JsonProperty("registrationDate")
	private Date registrationDate;


	private List<PaymentOrderDto> paymentOrder;

	public BranchOfficeDto() {
		super();
	}

	public BranchOfficeDto(String code, String name, String address, Date registrationDate,
			List<PaymentOrderDto> paymentOrder) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.registrationDate = registrationDate;
		this.paymentOrder = paymentOrder;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<PaymentOrderDto> getPaymentOrder() {
		return paymentOrder;
	}

	public void setPaymentOrder(List<PaymentOrderDto> paymentOrder) {
		this.paymentOrder = paymentOrder;
	}
	
	
}
