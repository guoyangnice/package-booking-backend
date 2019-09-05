package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.PackageBean;

@Mapper
public interface PackageMapper {
	//��ѯ
	@Select("select * from package")
	List<PackageBean> selectAll();
	
	//��������
	@Insert("insert into package values("
			+ "#{package.id},"
			+ "#{package.packageNumber},"
			+ "#{package.recipient},"
			+ "#{package.phoneNumber},"
			+ "#{package.weight},"
			+ "#{package.status},"
			+ "#{package.bookedTime})")
	void insertOnePackage(@Param("package") PackageBean packageBean);
}
