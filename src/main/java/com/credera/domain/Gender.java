package com.credera.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="gender")
@XmlEnum
public enum Gender {
	MALE,FEMALE;
}