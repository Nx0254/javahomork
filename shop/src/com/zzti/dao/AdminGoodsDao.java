package com.zzti.dao;
import java.util.ArrayList;

import com.zzti.entity.Goods;
public interface AdminGoodsDao {
	ArrayList<Goods> findAllGoods();
	Goods findGoods(String id);
	void deleteGoods(String id);
	void addGoods(Goods goods);
<<<<<<< HEAD
=======
	void updateGoods(Goods goods);
	ArrayList<Goods> serachGoods(String info);
>>>>>>> vcakn
}
