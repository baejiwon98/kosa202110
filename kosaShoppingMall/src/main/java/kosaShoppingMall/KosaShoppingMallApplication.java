package kosaShoppingMall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kosaShoppingMall.command.LoginCommand;
import kosaShoppingMall.service.goods.GoodsListPageSerivce;

@SpringBootApplication
@ComponentScan(value = "kosaShoppingMall")
@MapperScan(value = {"kosaShoppingMall"})
@Controller
public class KosaShoppingMallApplication {
	@Autowired
	GoodsListPageSerivce goodsListPageSerivce;
	
	@RequestMapping(value = "/")
	public String test(LoginCommand loginCommand, Model model) {
		goodsListPageSerivce.execute(model);
		return "thymeleaf/index";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(KosaShoppingMallApplication.class, args);
	}
}
