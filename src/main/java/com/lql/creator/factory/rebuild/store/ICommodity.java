package com.lql.creator.factory.rebuild.store;

import java.util.Map;

/**
 * Title: ICommodity <br>
 * ProjectName: learn-design <br>
 * description: 奖品类接口,所有奖品都要通过我们的程序实现此接口进行处理，以保证最终入参出参的统一性 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 21:56 <br>
 */
public interface ICommodity {

    /**
     * description: 发放奖品 <br>
     *
     * @author: leiql <br>
     * @version: 1.0 <br>
     * @since: 2021/2/28 22:02 <br>
     *
     * @throws
     * @param uId 用户id
     * @param commodityId 奖品id
     * @param bizId 业务id
     * @param extMap 扩展字段
     * @return void
     */
    void sendCommodity(Long uId, String commodityId, Long bizId,
                       Map<String, String> extMap) throws Exception;
}
