package com.lql.definition_springIOC.framework.context;

import com.lql.definition_springIOC.framework.bean.support.BeanFactory;

/**
 * Title: ApplicationContext <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 17:01 <br>
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
