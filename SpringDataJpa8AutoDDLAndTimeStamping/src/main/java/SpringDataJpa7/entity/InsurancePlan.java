package SpringDataJpa7.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Instbl")
public class InsurancePlan {
	@Id
	@GeneratedValue
private Integer planId;
@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planStatus=" + planStatus + ", planName=" + planName
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
private String  planStatus;
private String  planName;
@CreationTimestamp
@Column(updatable = false)
private Date createdDate;
@UpdateTimestamp
@Column(insertable = false)
private Date updatedDate;
}
