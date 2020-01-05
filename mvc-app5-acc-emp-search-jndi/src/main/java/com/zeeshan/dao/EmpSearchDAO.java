package com.zeeshan.dao;

import java.util.List;

import com.zeeshan.bo.SearchBO;
import com.zeeshan.bo.SearchResultBO;

public interface EmpSearchDAO {

	public List<SearchResultBO>search(SearchBO sbo);
}
