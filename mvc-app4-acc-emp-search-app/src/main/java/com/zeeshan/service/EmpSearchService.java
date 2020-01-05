package com.zeeshan.service;

import java.util.List;

import com.zeeshan.dto.SearchDTO;
import com.zeeshan.dto.SearchResultDTO;

public interface EmpSearchService {

	public List<SearchResultDTO> process(SearchDTO dto);
}