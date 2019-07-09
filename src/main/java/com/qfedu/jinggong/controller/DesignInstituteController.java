package com.qfedu.jinggong.controller;


import com.qfedu.jinggong.entity.DesignInstitute;
import com.qfedu.jinggong.service.DesignInstituteService;
import com.qfedu.jinggong.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "网页展示",tags = "展示信息")
public class DesignInstituteController {

    @Autowired
    private DesignInstituteService designInstituteService;

    @ApiOperation(value = "没有参数",notes = "查询基本的")
    @GetMapping("/show.do")
    public R showDesignInstitute(){
        DesignInstitute designInstitute = designInstituteService.queryInfo();
        System.out.println(designInstitute);
       return R.setOK("展示信息",designInstitute);
    }
}