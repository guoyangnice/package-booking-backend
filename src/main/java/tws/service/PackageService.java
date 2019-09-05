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
	
	//��������
	public List<PackageBean> getAllPackages(){
		List<PackageBean> packages = packageMapper.selectAll();
		return packages;
	}
	
	//��������
	public void insertOnePackage(PackageBean packageBean) {
		packageMapper.insertOnePackage(packageBean);
	}
}
