/******************************************************************
 *
 *    Powered By tianxia-online.
 *
 *    Copyright (c) 2018-2020 Digital Telemedia 天下网络
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.tianxia.controller
 *
 *    Filename:    DockerController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2018-2020
 *
 *    Company:     天下网络科技
 *
 *    @author: Tammy
 *
 *    @version: 1.0.0
 *
 *    Create at:   2018年08月13日 20:58
 *
 *    Revision:
 *
 *    2018年08月13日  20:58

 *        - first revision
 *
 *****************************************************************/
package com.tianxia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName DockerController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Author Tammy
 * @Date 2018年08月13日 20:58
 * @Version 1.0.0
 **/
@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        return "Hello Docker! ---- "+new Date().getTime();
    }
}
