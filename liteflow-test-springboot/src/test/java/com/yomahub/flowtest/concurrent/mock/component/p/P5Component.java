package com.yomahub.flowtest.concurrent.mock.component.p;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * 测试mock component
 * @author justin.xu
 */
@Component("p5")
public class P5Component extends NodeComponent {

    private static final String name = "p5";

    @Override
    public void process() throws Exception {
        throw new RuntimeException(String.format("test mock error [%s]", name));
    }
}