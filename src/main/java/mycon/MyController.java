package mycon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Date: 04.08.14
 *
 * @author sipachev_ai
 */
@Controller
public class MyController {

    @RequestMapping("getIds")
    public @ResponseBody List<Integer> getIdS(){
        return new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
    }

    @RequestMapping("getPOJO")
    public @ResponseBody List<POJOBean> getAllPojos(@RequestParam("page") Integer page,
                                                    @RequestParam("limit") Integer limit,
                                                    @RequestParam("start") Integer start) {
        System.out.println(page + " " + limit + " " + start);
        List<POJOBean> pojoBeans = new LinkedList<POJOBean>();

        for (int i = 0; i < 10; i++) {
            pojoBeans.add(getPojo(Integer.toHexString(i)));
        }
        return pojoBeans;
    }

    @RequestMapping("getPOJO/{name}")
    public @ResponseBody POJOBean getPojo(@PathVariable String name){
        POJOBean pojoBean = new POJOBean();
        pojoBean.setBeanName(name);
        pojoBean.setIds(Arrays.asList(1l, 2l, 3l));
        NestedPOJOBean nestedPOJOBean = new NestedPOJOBean();
        nestedPOJOBean.setName("nestedBean");
        pojoBean.setNestedPOJOBean(nestedPOJOBean);
        return pojoBean;
    }


}
