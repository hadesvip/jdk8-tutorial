package com.rule.engine.service;

import com.bean.PointDomain;

/**
 * 规则接口
 * Created by wangyong on 2016/8/15.
 */
public interface PointRuleEngine {

    /**
     * 初始化规则引擎
     */
    void initEngine();

    /**
     * 刷新规则引擎中的规则
     */
    void refreshEngineRule();

    /**
     * 执行规则引擎
     */
    void executeRuleEngine(PointDomain pointDomain);
}
