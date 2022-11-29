package com.example.jenkins_test.item.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	@Id @GeneratedValue
	private UUID id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Long price;
}
