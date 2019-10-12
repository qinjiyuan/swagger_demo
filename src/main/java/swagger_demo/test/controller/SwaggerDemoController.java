package swagger_demo.test.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class SwaggerDemoController {

    @RequestMapping(value="/test",method= RequestMethod.GET)
    @ApiOperation(value = "测试",notes = "测试")
    public String test(){
        return "test";
    }

    @PostMapping(value="/test1")
    @ApiOperation(value = "测试1",notes = "测试1")
    public String test1(@RequestParam String demo){
        return "test";
    }
}
