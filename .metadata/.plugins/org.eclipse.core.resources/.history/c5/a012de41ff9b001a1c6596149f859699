package org.boot.az.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.Dealer;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月22日 下午4:27:08 

* 类说明 

*/
public interface DealerMapper {

	@Select("SELECT * FROM T_Dealer WHERE Id = #{Id}")
	Dealer getDealerInfoById(String id);
	
	@Select("SELECT * FROM T_Dealer WHERE Area_Id = #{Area_Id}")
	List<Dealer> getDealerInfoAreaId(String aredId);
}
