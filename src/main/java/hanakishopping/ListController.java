package hanakishopping;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {



@Autowired

HttpSession session;


@RequestMapping (value="/ListViewing", method = RequestMethod.GET)
public ModelAndView show(ModelAndView mav) {

 ListForm listForm = (ListForm) session.getAttribute("form");

 if (listForm != null) {



     mav.addObject("num", listForm.getNum());

 }

 mav.addObject("listForm", new ListForm());


 ArrayList<Item> itemList = ListService.getItemList();

 mav.addObject("ItemList", itemList);

 mav.setViewName("ListViewing");



 return mav;

}



@RequestMapping (value="/ListViewing", method = RequestMethod.POST)

private ModelAndView order(ModelAndView mav,

   @Valid ListForm listForm, BindingResult bindingResult,

   HttpServletRequest request) {



 ArrayList<Order> orderList = (ArrayList<Order>) session.getAttribute("orderList");

 if (orderList == null) {

   orderList = new ArrayList<Order>();

   session.setAttribute("orderList", orderList);

 }

 if (bindingResult.getAllErrors().size() > 0) {

   mav.addObject("listForm", listForm);

   mav.addObject("orders", orderList);

   mav.setViewName("ListView");

   return mav;

 }



 Order order = new Order();

 order.setName(listForm.getName());

 order.setNum(listForm.getNum());

 orderList.add(order);

 session.setAttribute("form", listForm);



 return new ModelAndView("redirect:/ListViewing");
}

}