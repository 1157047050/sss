package com.ssm.entity;

import java.util.List;

public class Firm {
    private Integer fid;

    private String fname;

    private String ftrade;
    
    private List<FirmTerritoryKey> territorys;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFtrade() {
        return ftrade;
    }

    public void setFtrade(String ftrade) {
        this.ftrade = ftrade == null ? null : ftrade.trim();
    }

	public List<FirmTerritoryKey> getTerritorys() {
		return territorys;
	}

	public void setTerritorys(List<FirmTerritoryKey> territorys) {
		this.territorys = territorys;
	}
}