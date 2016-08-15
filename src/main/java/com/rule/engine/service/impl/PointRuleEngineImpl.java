package com.rule.engine.service.impl;

import com.bean.PointDomain;
import com.rule.engine.service.PointRuleEngine;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.drools.spi.Activation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyong on 2016/8/15.
 */
public class PointRuleEngineImpl implements PointRuleEngine {

    private RuleBase ruleBase;

    @Override
    public void initEngine() {
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");
        ruleBase = RuleBaseFactory.newRuleBase();
        try {
            PackageBuilder backageBuilder = getPackageBuilderFromDrlFile();
            ruleBase.addPackages(backageBuilder.getPackages());
        } catch (DroolsParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refreshEngineRule() {
        ruleBase = RuleBaseFactory.newRuleBase();
        org.drools.rule.Package[] packages = ruleBase.getPackages();
        for (org.drools.rule.Package pg : packages) {
            ruleBase.removePackage(pg.getName());
        }

        initEngine();
    }

    @Override
    public void executeRuleEngine(PointDomain pointDomain) {
        if (null == ruleBase.getPackages() || 0 == ruleBase.getPackages().length) {
            return;
        }

        StatefulSession statefulSession = ruleBase.newStatefulSession();
        statefulSession.insert(pointDomain);

        // fire
        statefulSession.fireAllRules(new org.drools.spi.AgendaFilter() {
            public boolean accept(Activation activation) {
                return !activation.getRule().getName().contains("_test");
            }
        });

        statefulSession.dispose();
    }


    private PackageBuilder getPackageBuilderFromDrlFile() throws Exception {
        // 获取测试脚本文件
        List<String> drlFilePath = getTestDrlFile();
        // 装载测试脚本文件
        List<Reader> readers = readRuleFromDrlFile(drlFilePath);

        PackageBuilder backageBuilder = new PackageBuilder();
        for (Reader r : readers) {
            backageBuilder.addPackageFromDrl(r);
        }

        // 检查脚本是否有问题
        if (backageBuilder.hasErrors()) {
            throw new Exception(backageBuilder.getErrors().toString());
        }

        return backageBuilder;
    }


    /**
     * 读取drl路径
     *
     * @param drlFilePath
     * @return
     * @throws FileNotFoundException
     */
    private List<Reader> readRuleFromDrlFile(List<String> drlFilePath) throws FileNotFoundException {
        if (null == drlFilePath || 0 == drlFilePath.size()) {
            return null;
        }

        List<Reader> readers = new ArrayList<>();

        for (String ruleFilePath : drlFilePath) {
            readers.add(new FileReader(new File(ruleFilePath)));
        }

        return readers;
    }

    private List<String> getTestDrlFile() {
        List<String> drlFilePath = new ArrayList<>();
        /*drlFilePath
                .add("addpoint.drl");*/
       /* drlFilePath
                .add("subpoint.drl");*/

        return drlFilePath;
    }

}
