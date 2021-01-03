package pe.com.jorgeberrios.crud.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


public class BankDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	private String address;
	private Date registrationDate;
	
	private List<BranchOfficeDto> branchOffice;
	public BankDto() {
		
	}
	public BankDto(String code, String name, String address, Date registrationDate,
			List<BranchOfficeDto> branchOffice) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.registrationDate = registrationDate;
		this.branchOffice = branchOffice;
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
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="EST")
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public List<BranchOfficeDto> getBranchOffice() {
		return branchOffice;
	}
	public void setBranchOffice(List<BranchOfficeDto> branchOffice) {
		this.branchOffice = branchOffice;
	}
	
		


	
}
