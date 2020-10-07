package retina.application.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

@Entity
public class Dataset implements Serializable {

	private static final long serialVersionUID = 1977346271603211229L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	protected Long id;

	@Column(name = "CMPLNT_NUM", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String cmplnt_num;

	@Column(name = "CMPLNT_FR_DT", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private LocalDate cmplnt_fr_dt;

	@Column(name = "CMPLNT_FR_TM", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private LocalTime cmplnt_fr_tm;

	@Column(name = "CMPLNT_TO_DT", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private LocalDate cmplnt_to_dt;

	@Column(name = "CMPLNT_TO_TM", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private LocalTime cmplnt_to_tm;

	@Column(name = "RPT_DT", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private LocalDate rpt_dt;

	@Column(name = "KY_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private int ky_cd;

	@Column(name = "OFNS_DESC", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String ofns_desc;

	@Column(name = "PD_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private int pd_cd;

	@Column(name = "PD_DESC", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String pd_desc;

	@Column(name = "CRM_ATPT_CPTD_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String crm_atpt_cptd_cd;

	@Column(name = "LAW_CAT_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String law_cat_cd;

	@Column(name = "JURIS_DESC", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private String juris_desc;

	@Column(name = "ADDR_PCT_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private int addr_pct_cd;

	@Column(name = "LOC_OF_OCCUR_DESC", length = 64)
	@Length(min = 0, max = 64)
	private String loc_of_occur_desc;

	@Column(name = "PREM_TYP_DESC", length = 64)
	@Length(min = 0, max = 64)
	private String prem_typ_desc;

	@Column(name = "PARKS_NM", length = 64)
	@Length(min = 0, max = 64)
	private String parks_nm;

	@Column(name = "HADEVELOPT", length = 64)
	@Length(min = 0, max = 64)
	private String hadevelopt;

	@Column(name = "X_COORD_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private double x_coord_cd;

	@Column(name = "Y_COORD_CD", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private double y_coord_cd;

	@Column(name = "Latitude", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private double latitude;

	@Column(name = "Longitude", nullable = false, length = 64)
	@Length(min = 0, max = 64)
	private double longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCmplnt_num() {
		return cmplnt_num;
	}

	public void setCmplnt_num(String cmplnt_num) {
		this.cmplnt_num = cmplnt_num;
	}

	public LocalDate getCmplnt_fr_dt() {
		return cmplnt_fr_dt;
	}

	public void setCmplnt_fr_dt(LocalDate cmplnt_fr_dt) {
		this.cmplnt_fr_dt = cmplnt_fr_dt;
	}

	public LocalTime getCmplnt_fr_tm() {
		return cmplnt_fr_tm;
	}

	public void setCmplnt_fr_tm(LocalTime cmplnt_fr_tm) {
		this.cmplnt_fr_tm = cmplnt_fr_tm;
	}

	public LocalDate getCmplnt_to_dt() {
		return cmplnt_to_dt;
	}

	public void setCmplnt_to_dt(LocalDate cmplnt_to_dt) {
		this.cmplnt_to_dt = cmplnt_to_dt;
	}

	public LocalTime getCmplnt_to_tm() {
		return cmplnt_to_tm;
	}

	public void setCmplnt_to_tm(LocalTime cmplnt_to_tm) {
		this.cmplnt_to_tm = cmplnt_to_tm;
	}

	public LocalDate getRpt_dt() {
		return rpt_dt;
	}

	public void setRpt_dt(LocalDate rpt_dt) {
		this.rpt_dt = rpt_dt;
	}

	public int getKy_cd() {
		return ky_cd;
	}

	public void setKy_cd(int ky_cd) {
		this.ky_cd = ky_cd;
	}

	public String getOfns_desc() {
		return ofns_desc;
	}

	public void setOfns_desc(String ofns_desc) {
		this.ofns_desc = ofns_desc;
	}

	public int getPd_cd() {
		return pd_cd;
	}

	public void setPd_cd(int pd_cd) {
		this.pd_cd = pd_cd;
	}

	public String getPd_desc() {
		return pd_desc;
	}

	public void setPd_desc(String pd_desc) {
		this.pd_desc = pd_desc;
	}

	public String getCrm_atpt_cptd_cd() {
		return crm_atpt_cptd_cd;
	}

	public void setCrm_atpt_cptd_cd(String crm_atpt_cptd_cd) {
		this.crm_atpt_cptd_cd = crm_atpt_cptd_cd;
	}

	public String getLaw_cat_cd() {
		return law_cat_cd;
	}

	public void setLaw_cat_cd(String law_cat_cd) {
		this.law_cat_cd = law_cat_cd;
	}

	public String getJuris_desc() {
		return juris_desc;
	}

	public void setJuris_desc(String juris_desc) {
		this.juris_desc = juris_desc;
	}

	public int getAddr_pct_cd() {
		return addr_pct_cd;
	}

	public void setAddr_pct_cd(int addr_pct_cd) {
		this.addr_pct_cd = addr_pct_cd;
	}

	public String getLoc_of_occur_desc() {
		return loc_of_occur_desc;
	}

	public void setLoc_of_occur_desc(String loc_of_occur_desc) {
		this.loc_of_occur_desc = loc_of_occur_desc;
	}

	public String getPrem_typ_desc() {
		return prem_typ_desc;
	}

	public void setPrem_typ_desc(String prem_typ_desc) {
		this.prem_typ_desc = prem_typ_desc;
	}

	public String getParks_nm() {
		return parks_nm;
	}

	public void setParks_nm(String parks_nm) {
		this.parks_nm = parks_nm;
	}

	public String getHadevelopt() {
		return hadevelopt;
	}

	public void setHadevelopt(String hadevelopt) {
		this.hadevelopt = hadevelopt;
	}

	public double getX_coord_cd() {
		return x_coord_cd;
	}

	public void setX_coord_cd(double x_coord_cd) {
		this.x_coord_cd = x_coord_cd;
	}

	public double getY_coord_cd() {
		return y_coord_cd;
	}

	public void setY_coord_cd(double y_coord_cd) {
		this.y_coord_cd = y_coord_cd;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Dataset() {

	}

	public Dataset(Long id, @Length(min = 0, max = 64) String cmplnt_num,
			@Length(min = 0, max = 64) LocalDate cmplnt_fr_dt, @Length(min = 0, max = 64) LocalTime cmplnt_fr_tm,
			@Length(min = 0, max = 64) LocalDate cmplnt_to_dt, @Length(min = 0, max = 64) LocalTime cmplnt_to_tm,
			@Length(min = 0, max = 64) LocalDate rpt_dt, @Length(min = 0, max = 64) int ky_cd,
			@Length(min = 0, max = 64) String ofns_desc, @Length(min = 0, max = 64) int pd_cd,
			@Length(min = 0, max = 64) String pd_desc, @Length(min = 0, max = 64) String crm_atpt_cptd_cd,
			@Length(min = 0, max = 64) String law_cat_cd, @Length(min = 0, max = 64) String juris_desc,
			@Length(min = 0, max = 64) int addr_pct_cd, @Length(min = 0, max = 64) String loc_of_occur_desc,
			@Length(min = 0, max = 64) String prem_typ_desc, @Length(min = 0, max = 64) String parks_nm,
			@Length(min = 0, max = 64) String hadevelopt, @Length(min = 0, max = 64) double x_coord_cd,
			@Length(min = 0, max = 64) double y_coord_cd, @Length(min = 0, max = 64) double latitude,
			@Length(min = 0, max = 64) double longitude) {
		super();
		this.id = id;
		this.cmplnt_num = cmplnt_num;
		this.cmplnt_fr_dt = cmplnt_fr_dt;
		this.cmplnt_fr_tm = cmplnt_fr_tm;
		this.cmplnt_to_dt = cmplnt_to_dt;
		this.cmplnt_to_tm = cmplnt_to_tm;
		this.rpt_dt = rpt_dt;
		this.ky_cd = ky_cd;
		this.ofns_desc = ofns_desc;
		this.pd_cd = pd_cd;
		this.pd_desc = pd_desc;
		this.crm_atpt_cptd_cd = crm_atpt_cptd_cd;
		this.law_cat_cd = law_cat_cd;
		this.juris_desc = juris_desc;
		this.addr_pct_cd = addr_pct_cd;
		this.loc_of_occur_desc = loc_of_occur_desc;
		this.prem_typ_desc = prem_typ_desc;
		this.parks_nm = parks_nm;
		this.hadevelopt = hadevelopt;
		this.x_coord_cd = x_coord_cd;
		this.y_coord_cd = y_coord_cd;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Dataset [cmplnt_num=" + cmplnt_num + ", cmplnt_fr_dt=" + cmplnt_fr_dt + ", cmplnt_fr_tm=" + cmplnt_fr_tm
				+ ", cmplnt_to_dt=" + cmplnt_to_dt + ", cmplnt_to_tm=" + cmplnt_to_tm + ", rpt_dt=" + rpt_dt
				+ ", ky_cd=" + ky_cd + ", ofns_desc=" + ofns_desc + ", pd_cd=" + pd_cd + ", pd_desc=" + pd_desc
				+ ", crm_atpt_cptd_cd=" + crm_atpt_cptd_cd + ", law_cat_cd=" + law_cat_cd + ", juris_desc=" + juris_desc
				+ ", addr_pct_cd=" + addr_pct_cd + ", loc_of_occur_desc=" + loc_of_occur_desc + ", prem_typ_desc="
				+ prem_typ_desc + ", parks_nm=" + parks_nm + ", hadevelopt=" + hadevelopt + ", x_coord_cd=" + x_coord_cd
				+ ", y_coord_cd=" + y_coord_cd + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
