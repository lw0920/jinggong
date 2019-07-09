package com.qfedu.jinggong.service.Impl;

import com.qfedu.jinggong.dao.DesignInstituteDao;
import com.qfedu.jinggong.entity.DesignInstitute;
import com.qfedu.jinggong.service.DesignInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignInstituteServiceImpl  implements DesignInstituteService {

    @Autowired
    private DesignInstituteDao designInstituteDao;
    @Override
    public DesignInstitute queryInfo() {
        return designInstituteDao.queryInfo();
    }
}