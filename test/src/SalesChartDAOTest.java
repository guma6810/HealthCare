import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SalesChartDAOTest {
	SalesChart chart = new SalesChart();
	Member member = new Member();
	Staff staff = new Staff();
	Goods goods = new Goods();
	ArrayList<SalesChart> list = new ArrayList<SalesChart>();
	SalesChartDAO dao = new SalesChartDAO();

	@Test
	void testAddSalesChart() {
		goods.setGoodsId(10001);
		dao.AddSalesChart(chart, goods, member, staff);
	}

	@Test
	void testModifySalesChart() {
		dao.ModifySalesChart(chart, goods, member, staff);
	}

	@Test
	void testDeleteSalesChart() {
		chart.setTransactionId(1234);
		dao.DeleteSalesChart(chart.getTransactionId());
	}

	@Test
	void testGetSalesChart() {
		list = dao.GetSalesChart("1999-09-09", "2017-12-12");
	}

}
