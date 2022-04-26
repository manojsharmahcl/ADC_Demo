package com.hcl.order.api.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaUtil {
	static final int DEFAULT_PAGE_SIZE = 10;



	public static <T> Page<T> getPages(JpaRepository<T,Long> repository,Integer size,
			Integer page)
	{

		if (size == null) {
			size = DEFAULT_PAGE_SIZE;
		}
		if (page == null) {
			page = 0;
		}
		Page<T> t = repository.findAll(PageRequest.of(page, size));
		return t;
	}
	
	public static  PageRequest getPageRequests(Integer size,
			Integer page)
	{
		if (size == null) {
			size = DEFAULT_PAGE_SIZE;
		}
		if (page == null) {
			page = 0;
		}
		return PageRequest.of(page, size);
	}

}
