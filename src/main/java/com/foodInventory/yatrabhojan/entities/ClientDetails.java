package com.foodInventory.yatrabhojan.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientDetails {
	@Id
	@Column(name = "ORDER_NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String orderNo;
	@Column(name = "DOJ")
	private Date doj;
	@Column(name = "NAME")
	private String name;
	@Column(name = "CENTER_NAME")
	private String centerName;
	@Column(name = "GUIDE_NAME")
	private String guideName;
	@Column(name = "USER_CONTACT")
	private String contactNo;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "GUIDE_CONTACT")
	private String guideContactNo;
	@Column(name = "QTY")
	private String foodQty;
}
