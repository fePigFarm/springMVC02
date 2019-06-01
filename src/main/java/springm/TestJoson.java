package springm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-31
 * @Description: springm
 * @version: 1.0
 */

@RestController(value = "promotion")
public class TestJoson {
    @ResponseBody // 告诉springMVC此时的返回值是一个ajax返回值，返回给调用地方
    @RequestMapping(value = "testJson")
    public List<People> testJson() {
        People people1 = new People("黑人", 34);
        People people2 = new People("拜仁", 12);
        People people3 = new People("黄人", 14);
        List<People> list = new ArrayList<People>();
        list.add(people1);
        list.add(people2);
        list.add(people3);
        for(People item: list) {
            System.out.println(item.getName());
        }

        return list;
    }

    @ResponseBody // 告诉springMVC此时的返回值是一个ajax返回值，返回给调用地方
    @RequestMapping(value = "testJson1")
    public String testJson1() {


        return "hhhhh";
    }
}
