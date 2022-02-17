package kosaShoppingMall.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kosaShoppingMall.domain.CartDTO;
import kosaShoppingMall.domain.GoodsBuy;
import kosaShoppingMall.domain.GoodsCartDTO;
import kosaShoppingMall.domain.MemberDTO;
import kosaShoppingMall.domain.PaymentDTO;
import kosaShoppingMall.domain.PaymentPurchaseGoodsDTO;
import kosaShoppingMall.domain.PurchaseDTO;
import kosaShoppingMall.domain.PurchaseListDTO;

@Component
@Repository(value = "kosaShoppingMall.mapper.MemberShipMapper")
public interface MemberShipMapper {
	public MemberDTO selectOne(String memid);
	public Integer memberInsert(MemberDTO dto);
	public Integer memberUpdate(MemberDTO dto);
	public Integer updatePassword(MemberDTO dto);
	public Integer memberDrop(String memId);
	public List<GoodsCartDTO> cartList(String memberNum);
	public Integer goodsCartQtyDown(CartDTO dto);
	public List<GoodsCartDTO> goodsOrder(GoodsBuy goodsBuy);
	// 성호
	public Integer goodsCartDels(String[] goodsNum);
	// 
	public Integer purchase(PurchaseDTO dto);
	public Integer purchaseList(PurchaseListDTO purchaseListDTO);
	public Integer cartGoodsDel(GoodsBuy goodsBuy);
	public List<PaymentPurchaseGoodsDTO> orderList(String memberNum);
	public Integer payment(PaymentDTO paymentDTO);
	public Integer purchaseStatus(String purchaseNum);
}