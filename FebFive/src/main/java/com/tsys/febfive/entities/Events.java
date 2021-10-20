package com.tsys.febfive.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer eventId;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String discription;
	
	@Column(nullable = false)
	private String venue;
	
	@Column(nullable = false)
	private LocalDateTime fromDt;
	
	@Column(nullable = false)
	private LocalDateTime toDt;
	
	private LocalDateTime createdDt;
	
	private LocalDateTime updateDt;
	
	//private User user;
	//private Category category;
}
