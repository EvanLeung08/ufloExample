package com.eshare.uflo.example;


import com.bstek.uflo.console.provider.ProcessFile;
import com.bstek.uflo.console.provider.ProcessProvider;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

/**
 * @author Evan
 * 自定义流程提供
 */
@Component
public class TestProcessProvider implements ProcessProvider {

    @Override
    public InputStream loadProcess(String fileName) {
        return null;
    }

    @Override
    public List<ProcessFile> loadAllProcesses() {
        return null;
    }

    @Override
    public void saveProcess(String fileName, String content) {

    }

    @Override
    public void deleteProcess(String fileName) {

    }

    @Override
    public String getName() {
        return "数据库";
    }

    @Override
    public String getPrefix() {
        return "db:";
    }

    @Override
    public boolean support(String fileName) {
        return false;
    }

    @Override
    public boolean isDisabled() {
        return false;
    }
}
