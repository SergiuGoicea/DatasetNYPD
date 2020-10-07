package retina.application.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DatasetDto extends BaseDto {

	private static final long serialVersionUID = -8546595561388900168L;

	@NotNull
	@Size(min = 0, max = 64)
	private String cmplnt_num;

	@NotNull
	private int ky_cd;

	public String getCmplnt_num() {
		return cmplnt_num;
	}

	public void setCmplnt_num(String cmplnt_num) {
		this.cmplnt_num = cmplnt_num;
	}

	public int getKy_cd() {
		return ky_cd;
	}

	public void setKy_cd(int ky_cd) {
		this.ky_cd = ky_cd;
	}

	@Override
	public String toString() {
		return "DatasetDto [cmplnt_num=" + cmplnt_num + ", ky_cd=" + ky_cd + "]";
	}

}
