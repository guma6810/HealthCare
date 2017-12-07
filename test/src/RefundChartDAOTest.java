import static org.junit.jupiter.api.Assertions.*;
<<<<<<< HEAD

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class RefundChartDAOTest {
	
	Staff staff;
	Member member;
	RefundChartDAO dao = new RefundChartDAO();
	RefundChart refundChart = new RefundChart(1,1,"1","1","1",1,1,"1"); 
	ArrayList<RefundChart> list= new ArrayList<RefundChart>();
	@Test
	void testRefundChartAdd() {
		dao.RefundChartAdd(refundChart, staff, member);
=======
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class RefundChartDAOTest {
	
	RefundChartDAO dao = new RefundChartDAO();
	Staff staff = new Staff();
	Member member = new Member();
	RefundChart refundChart = new RefundChart(2,1,"S001","M005","2017-11-02 15:38:55","2017-11-02",100,10,"불만족");
	ArrayList<RefundChart> list = new ArrayList<RefundChart>();
	
	@Test
	void testRefundChartAdd() {
		dao.RefundChartAdd(refundChart);
>>>>>>> leeyubin
	}

	@Test
	void testGetRefundChartList() {
<<<<<<< HEAD
		list=dao.GetRefundChartList("1", "1");
		for (RefundChart temp : list) {
			System.out.println(temp.getRefundId());
		}
=======
		list = dao.GetRefundChartList("2017-11-02 15:38:55", "2017-11-07 22:19:27");
>>>>>>> leeyubin
	}

	@Test
	void testDeleteRefundChart() {
<<<<<<< HEAD
		dao.DeleteRefundChart(1);
=======
		dao.DeleteRefundChart(2);
>>>>>>> leeyubin
	}

	@Test
	void testModifyRefundChart() {
<<<<<<< HEAD
		refundChart.setDeductMoney(10000);
=======
>>>>>>> leeyubin
		dao.ModifyRefundChart(refundChart, staff, member);
	}

}
