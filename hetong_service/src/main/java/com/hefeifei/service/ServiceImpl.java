package com.hefeifei.service;

import com.hefeifei.dao.HeTongDao;
import com.hefeifei.dao.HuiKuanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {
    @Autowired
    private HeTongDao heTongDao;
    @Autowired
    private HuiKuanDao huiKuanDao;
}
