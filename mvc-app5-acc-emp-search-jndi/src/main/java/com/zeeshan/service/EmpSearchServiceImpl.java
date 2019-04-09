package com.zeeshan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.zeeshan.bo.SearchBO;
import com.zeeshan.bo.SearchResultBO;
import com.zeeshan.dao.EmpSearchDAO;
import com.zeeshan.dto.SearchDTO;
import com.zeeshan.dto.SearchResultDTO;

import lombok.Data;

@Data
public class EmpSearchServiceImpl implements EmpSearchService {

	private EmpSearchDAO dao;
	Logger logger = Logger.getLogger(EmpSearchServiceImpl.class.getName());

	@Override
	public List<SearchResultDTO> process(SearchDTO dto) {
		logger.info("serviec process(-) invoked");
		SearchBO bo = new SearchBO();
		bo.setNo(dto.getNo());
		bo.setName(dto.getName());
		bo.setDesg(dto.getDesg());
		bo.setSalary(dto.getSalary());

		List<SearchResultBO> listBO = dao.search(bo);
		List<SearchResultDTO> listDTO = new ArrayList<SearchResultDTO>();

		for (SearchResultBO sbo : listBO) {

			SearchResultDTO sto = new SearchResultDTO(sbo.getNo(), sbo.getName(), sbo.getDesg(), sbo.getSalary(),
					sbo.getDeptno(), sbo.getMgrno());
			listDTO.add(sto);
		}

		return listDTO;
	}

}
