;import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GoodsDAOTest {
	Goods goods = new Goods();
	ArrayList<Goods> list = new ArrayList<Goods>();
	GoodsDAO dao = new GoodsDAO();
	
	@Test
	void testAddGoods() {
		goods.setGoodsId(1515);
		goods.setCategoryId(1);
		dao.AddGoods(goods);
	}

	@Test
	void testModifyGoods() {
		goods.setCategoryId(1234);
		dao.ModifyGoods(goods);
	}

	@Test
	void testDeleteGoods() {
		dao.DeleteGoods(1515);
	}

	@Test
	void testGetGoods() {
		list = dao.GetGoods();
	}

}
