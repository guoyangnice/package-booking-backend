package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.PackageBean;
import tws.repository.PackageMapper;

@Service
public class PackageService {
	@Autowired
	private PackageMapper packageMapper;
	
	//查找所有
	public List<PackageBean> getAllPackages(){
		List<PackageBean> packages = packageMapper.selectAll();
		return packages;
	}
	
	//插入数据
	public void insertOnePackage(PackageBean packageBean) {
		packageMapper.insertOnePackage(packageBean);
	}
}
