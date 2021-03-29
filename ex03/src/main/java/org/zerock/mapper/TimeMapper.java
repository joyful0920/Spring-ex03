package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// 세미콜론이 없어야 한다!!
	@Select("select NOW()")
	public String getTime();
	
	// MyBatis의 어노테이션과 SQL이 존재 하지 않는다? -> SQL 처리는 XML을 통해
	public String getTime2();
}